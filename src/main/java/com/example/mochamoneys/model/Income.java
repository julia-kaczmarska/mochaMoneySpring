package com.example.mochamoneys.model;


import lombok.*;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long incomeId;
    private double amount;
    private LocalDate date;
    private long categoryincId;
    private long budgetId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryincId", updatable = false, insertable = false)
    private Categoryinc categoryinc;
}
