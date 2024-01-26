package com.example.mochamoneys.repository;

import com.example.mochamoneys.model.Categoryexp;
import com.example.mochamoneys.model.Categoryinc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryexpRepository extends JpaRepository<Categoryexp, Long> {

    List<Categoryexp> findAllByUserIdIn(List<Long> ids);
}