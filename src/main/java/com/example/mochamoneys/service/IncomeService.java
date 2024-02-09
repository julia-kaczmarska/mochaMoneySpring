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
    private static final int PAGE_SIZE = 3;


    private IncomeRepository incomeRepository;

    public List<Income> getIncomes(int page, Sort.Direction sort) {
        return incomeRepository.findAllIncomes(
                PageRequest.of(page, PAGE_SIZE,
                        Sort.by(sort, "id")
                )
        );
    }

}
