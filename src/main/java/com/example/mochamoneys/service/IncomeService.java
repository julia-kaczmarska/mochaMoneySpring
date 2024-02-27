package com.example.mochamoneys.service;

import com.example.mochamoneys.model.Income;
import com.example.mochamoneys.repository.IncomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IncomeService {

    private final IncomeRepository incomeRepository;

    public List<Income> getIncomes() {
        return incomeRepository.findAllIncomes();
    }

}
