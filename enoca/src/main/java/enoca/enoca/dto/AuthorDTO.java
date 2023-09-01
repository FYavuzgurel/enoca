package enoca.enoca.dto;

import enoca.enoca.domain.Book;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AuthorDTO {
    private String firstName;
    private String lastName;
    private Date birthDay;

    private List<Book> books ;
}
