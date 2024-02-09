package com.example.mochamoneys.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
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

    public Categoryinc getCategoryinc() {
        return categoryinc;
    }

    public void setCategoryinc(Categoryinc categoryinc) {
        this.categoryinc = categoryinc;
    }
}
