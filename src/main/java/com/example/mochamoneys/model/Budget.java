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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "budgetId", updatable = false, insertable = false)
    private List<User> user;
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "budgetId", updatable = false, insertable = false)
    private List<Expense> expense;
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "budgetId", updatable = false, insertable = false)
    private List<Income> income;
}