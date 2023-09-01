package enoca.enoca.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "author")
public class Author extends BaseEntity{

    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "birthDay")
    private Date birthDay;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books ;



}
