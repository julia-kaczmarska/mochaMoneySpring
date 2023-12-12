package pl.mochamoneys.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Expense {
    @Id
    private long expenseId;
    private float amount;
    private LocalDate date;
    private boolean plan;
}
