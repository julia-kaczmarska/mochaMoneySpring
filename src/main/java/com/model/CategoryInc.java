package com.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CategoryInc {
    @Id
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
