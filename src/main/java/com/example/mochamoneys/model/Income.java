package com.example.mochamoneys.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.time.LocalDate;

@Entity
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long incomeId;
    private float amount;
    private LocalDate date;
    private boolean plan;

    public long getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(long incomeId) {
        this.incomeId = incomeId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isPlan() {
        return plan;
    }

    public void setPlan(boolean plan) {
        this.plan = plan;
    }
}
