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
    private List<Expense> expense;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "budgetId", updatable = false, insertable = false)
    private List<Income> income;


//    public List<Income> getIncomes() {
//        return incomes;
//    }
//
//    public void setIncomes(List<Income> incomes) {
//        this.incomes = incomes;
//    }


}