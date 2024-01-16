package com.example.mochamoneys.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoryInc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryIncId;
    private String title;


    public long getCategoryIncId() {
        return categoryIncId;
    }

    public void setCategoryIncId(long categoryIncId) {
        this.categoryIncId = categoryIncId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
