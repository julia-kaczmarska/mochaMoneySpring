package com.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Budget {
    @Id
    private Long budgetId;
    private String title;


    public long getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(long budgetId) {
        this.budgetId = budgetId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
