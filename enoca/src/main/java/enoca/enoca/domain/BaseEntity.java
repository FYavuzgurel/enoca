package enoca.enoca.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public abstract class BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
    @SequenceGenerator(name = "id_sequence", sequenceName = "id_sequence", allocationSize = 1)
    @Column(name = "id", precision = 18)
    protected Long id;

    @JsonIgnore
    @CreatedDate
    @Column(name = "kayit_zamani", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date kayitZamani;

    @JsonIgnore
    @LastModifiedDate
    @Column(name = "guncelleme_zamani")
    @Temporal(TemporalType.TIMESTAMP)
    private Date guncellemeZamani;

}
