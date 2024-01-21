package com.example.mochamoneys.service;

import com.example.mochamoneys.model.Income;
import com.example.mochamoneys.repository.IncomeRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public class IncomeService {

    private final IncomeRepository incomeRepository;

    public IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    public List<Income> getIncomes(Long user_id) {
        return incomeRepository.findAll();
    }

//    public Income getIncome(Long userId, Long incomeId) {
//        return incomeRepository.findByUserIdAndIncomeId(userId, incomeId)
//                .orElseThrow(() -> new EntityNotFoundException("Income not found"));
//    }

    public Income createIncome(Income income) {
        return incomeRepository.save(income);
    }

    public Income updateIncome(Income income){
        return incomeRepository.save(income);
    }

    public void deleteIncome(Long income_id){
        incomeRepository.deleteById(income_id);
    }
}
