package com.example.mochamoneys.repository;

import com.example.mochamoneys.model.Categoryinc;
import com.example.mochamoneys.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryincRepository extends JpaRepository<Categoryinc, Long> {

    List<Categoryinc> findAllByUserIdIn(List<Long> ids);
}