package enoca.enoca.service.impl;

import enoca.enoca.domain.Book;
import enoca.enoca.dto.BookDTO;
import enoca.enoca.exception.BookNotFoundException;
import enoca.enoca.mappers.ModelMapperService;
import enoca.enoca.repository.BookRepository;
import enoca.enoca.service.interfaces.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private  final BookRepository bookRepository;
    private  final ModelMapperService modelMapperService;
    @Override
    public BookDTO save(BookDTO bookDTO) {
        Book book=  this.modelMapperService.forRequest().map(bookDTO,Book.class);
        return this.modelMapperService.forResponse().map(bookRepository.save(book),BookDTO.class);
    }

    @Override
    public BookDTO update(BookDTO bookDTO) {
        Book book=  this.modelMapperService.forRequest().map(bookDTO,Book.class);
        return this.modelMapperService.forResponse().map(bookRepository.save(book),BookDTO.class);
    }

    @Override
    public List<BookDTO> getAll() {
        List<Book> bookList = bookRepository.findAll();
        List<BookDTO> bookDTOList = bookList
                .stream()
                .map(book -> this.modelMapperService.forResponse().map(book,BookDTO.class))
                .collect(Collectors.toList());
        return bookDTOList;
    }

    @Override
    public BookDTO findById(Long id) {
        Book book=bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found !"));
        return this.modelMapperService.forResponse().map(book,BookDTO.class);
    }

    @Override
    public void delete(Long id) {
        Book book=bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found !"));
        bookRepository.delete(book);
    }
}
