package enoca.enoca.service.interfaces;

import enoca.enoca.dto.AuthorDTO;
import enoca.enoca.dto.BookDTO;

import java.util.List;

public interface BookService {

    public BookDTO save(BookDTO bookDTO);
    public BookDTO update(BookDTO bookDTO);
    public List<BookDTO> getAll();
    public BookDTO findById(Long id);
    public void delete(Long id);

}
