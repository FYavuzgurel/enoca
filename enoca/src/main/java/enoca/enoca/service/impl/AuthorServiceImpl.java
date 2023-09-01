package enoca.enoca.service.impl;
import enoca.enoca.domain.Author;
import enoca.enoca.dto.AuthorDTO;
import enoca.enoca.exception.AuthorNotFoundException;
import enoca.enoca.exception.BookNotFoundException;
import enoca.enoca.mappers.ModelMapperService;
import enoca.enoca.repository.AuthorRepository;
import enoca.enoca.service.interfaces.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private  final AuthorRepository authorRepository;

    private  final ModelMapperService modelMapperService;
    @Override
    public AuthorDTO save(AuthorDTO authorDTO) {
        Author author=  this.modelMapperService.forRequest().map(authorDTO,Author.class);
        return this.modelMapperService.forResponse().map(authorRepository.save(author), AuthorDTO.class);
    }

    @Override
    public AuthorDTO update(AuthorDTO authorDTO) {
        Author author=  this.modelMapperService.forRequest().map(authorDTO,Author.class);
        return this.modelMapperService.forResponse().map(authorRepository.save(author), AuthorDTO.class);
    }

    @Override
    public List<AuthorDTO> getAll() {
        List<Author> authorList = authorRepository.findAll();
        List<AuthorDTO> authorDTOList = authorList
                .stream()
                .map(author -> this.modelMapperService.forResponse().map(author,AuthorDTO.class))
                .collect(Collectors.toList());
        return authorDTOList;
    }

    @Override
    public AuthorDTO findById(Long id) {
        Author author=authorRepository.findById(id).orElseThrow(() -> new AuthorNotFoundException("Author not found !"));
        return this.modelMapperService.forResponse().map(author,AuthorDTO.class);
    }

    @Override
    public void delete(Long id) {
        Author author=authorRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Author not found !"));
        authorRepository.delete(author);
    }
}
