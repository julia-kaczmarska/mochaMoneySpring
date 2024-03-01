package com.example.mochamoneys.service;

import com.example.mochamoneys.model.Expense;
import com.example.mochamoneys.model.Income;
import com.example.mochamoneys.repository.ExpenseRepository;
import com.example.mochamoneys.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;


@Service
public class BudgetDtoService {

    private final IncomeRepository incomeRepository;
    private final ExpenseRepository expenseRepository;
    public static int getLastDayOfMonthUsingYearMonth(YearMonth date) {
        return date.atEndOfMonth()
                .getDayOfMonth();
    }
    @Autowired
    public BudgetDtoService(IncomeRepository incomeRepository, ExpenseRepository expenseRepository) {
        this.incomeRepository = incomeRepository;
        this.expenseRepository = expenseRepository;}
}
