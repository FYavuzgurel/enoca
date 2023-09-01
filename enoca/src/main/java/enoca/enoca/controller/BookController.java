package enoca.enoca.controller;

import enoca.enoca.dto.BookDTO;
import enoca.enoca.service.impl.BookServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/book")
public class BookController {
    private final BookServiceImpl bookService;

    @PostMapping
    public ResponseEntity<BookDTO> save(@RequestBody BookDTO authorDTO) {
        return ResponseEntity.ok(bookService.save(authorDTO));
    }

    @GetMapping
    public ResponseEntity<List<BookDTO>> getAll() {
        return ResponseEntity.ok(bookService.getAll());

    }
    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.findById(id));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }

}
