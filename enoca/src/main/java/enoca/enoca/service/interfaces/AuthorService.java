package enoca.enoca.service.interfaces;

import enoca.enoca.dto.AuthorDTO;

import java.util.List;

public interface AuthorService {
    public AuthorDTO save(AuthorDTO authorDTO);
    public AuthorDTO update(AuthorDTO authorDTO);
    public List<AuthorDTO> getAll();
    public AuthorDTO findById(Long id);
    public void delete(Long id);

}
