package com.example.mochamoneys.service;

import com.example.mochamoneys.model.Income;
import com.example.mochamoneys.repository.IncomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class IncomeService {


    private final IncomeRepository incomeRepository;

//    public List<Income> getIncomes() {
//        return incomeRepository.findAllIncomes();
//    }
////    public List<Income> getIncomeByBudgetIdAndDate(Long id, LocalDate dateFrom, LocalDate dateTo){
////        List<Income> databaseIncomes = incomeRepository.findAllByBudgetIdAndDateBetween(id, dateFrom, dateTo);
////        List<Income> incomes = new ArrayList<>();
////        for(Income i : databaseIncomes){
////            incomes.add(Income
////                    .builder()
////                            .incomeId(i.getIncomeId())
////                            .amount(i.getAmount())
////                            .date(i.getDate())
////                            .budgetId(i.getBudgetId())
////                    .build());
////        }
////        return incomes;
////
////    }

}
