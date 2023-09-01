package enoca.enoca.controller;

import enoca.enoca.dto.AuthorDTO;
import enoca.enoca.service.interfaces.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/author")
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping
    public ResponseEntity<AuthorDTO> save(@RequestBody AuthorDTO authorDTO) {
        return ResponseEntity.ok(authorService.save(authorDTO));
    }

    @GetMapping
    public ResponseEntity<List<AuthorDTO>> getAll() {
        return ResponseEntity.ok(authorService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(authorService.findById(id));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        authorService.delete(id);
    }

}
