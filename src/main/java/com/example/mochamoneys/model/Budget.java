package com.example.mochamoneys.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long budgetId;
    private long userId;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "userId", updatable = false, insertable = false)
    private User user;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "budgetId", updatable = false, insertable = false)
    private List<Expense> expenses;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "budgetId", updatable = false, insertable = false)
    private List<Income> incomes;
}