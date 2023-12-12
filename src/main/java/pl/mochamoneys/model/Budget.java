package pl.mochamoneys.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Budget {
    @Id
    private long budgetId;
    private String title;
}
