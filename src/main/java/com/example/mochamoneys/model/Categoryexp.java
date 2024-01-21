package com.example.mochamoneys.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Categoryexp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryExpId;
    private String title;


    public long getCategoryExpId() {
        return categoryExpId;
    }

    public void setCategoryExpId(long categoryExId) {
        this.categoryExpId = categoryExpId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
