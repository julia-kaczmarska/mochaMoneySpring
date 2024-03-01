package com.example.mochamoneys.model;


import lombok.*;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long expenseId;
    private double amount;
    private LocalDate date;
    private long budgetId;
    private long categoryexpId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryexpId", updatable = false, insertable = false)
    private Categoryexp categoryexp;
}
