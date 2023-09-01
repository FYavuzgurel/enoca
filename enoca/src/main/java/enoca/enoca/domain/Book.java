package enoca.enoca.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "book")
public class Book extends BaseEntity{
    @Column(name = "title")
    private String title;
    @Column(name = "price")
    private Double price;

    @Column(name = "publisher")
    private String publisher;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;
}
