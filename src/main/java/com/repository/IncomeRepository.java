package com.repository;

import com.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IncomeRepository extends JpaRepository<Income, Long> {
    Optional<Income> findByUserIdAndIncomeId(Long userId, Long incomeId);
}
