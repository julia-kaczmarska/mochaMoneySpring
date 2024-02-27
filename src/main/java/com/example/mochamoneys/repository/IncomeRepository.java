package com.example.mochamoneys.repository;

import com.example.mochamoneys.model.Income;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {

    @Query("SELECT DISTINCT i FROM Income i")
    List<Income> findAllIncomes();

}
