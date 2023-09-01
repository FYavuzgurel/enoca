package enoca.enoca.dto;

import enoca.enoca.domain.Author;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {

    private Long id;
    private String title;
    private Double price;

    private String publisher;
    private Author author;
}
