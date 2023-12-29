package com.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class CategoryExp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryExpId;
    private String title;


    public long getCategoryExpId() {
        return categoryExpId;
    }

    public void setCategoryExpId(long categoryExpId) {
        this.categoryExpId = categoryExpId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
