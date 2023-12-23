package com.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class CategoryExp {
    @Id
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
