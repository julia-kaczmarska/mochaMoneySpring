package com.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Income {
    @Id
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
