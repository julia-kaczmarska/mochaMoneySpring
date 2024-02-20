package com.example.mochamoneys.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Categoryexp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long categoryexpId;
    private String title;
    private long userId;
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "categoryexpId", updatable = false, insertable = false)
    private List<Expense> expense;

}
