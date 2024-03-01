package com.example.mochamoneys.service;

import com.example.mochamoneys.model.Expense;
import com.example.mochamoneys.model.Income;
import com.example.mochamoneys.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    public final ExpenseRepository expenseRepository;

//    public List<Expense> getByBudgetIdAndDate(Long id, LocalDate dateFrom, LocalDate dateTo){
//        List<Expense> databaseExpenses = expenseRepository.findAllByBudgetIdAndDateBetween(id, dateFrom, dateTo);
//        List<Expense> expenses = new ArrayList<>();
//        for(Expense e : databaseExpenses){
//            expenses.add(Expense
//                    .builder()
//                    .expenseId(e.getExpenseId())
//                    .amount(e.getAmount())
//                    .date(e.getDate())
//                    .budgetId(e.getBudgetId())
//                    .build());
//        }
//        return expenses;
//    }
}
