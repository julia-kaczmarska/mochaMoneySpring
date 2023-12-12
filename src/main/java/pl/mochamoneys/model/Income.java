package pl.mochamoneys.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Income {
    @Id
    private long incomeId;
    private float amount;
    private LocalDate date;
    private boolean plan;
}
