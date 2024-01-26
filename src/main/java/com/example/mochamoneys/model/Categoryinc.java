package com.example.mochamoneys.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Categoryinc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private long userId;
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "categoryincId", updatable = false, insertable = false)
    private List<Income> income;
}
