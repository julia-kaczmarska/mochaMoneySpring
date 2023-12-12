package pl.mochamoneys.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CategoryInc {
    @Id
    private long categoryIncId;
    private String title;
}
