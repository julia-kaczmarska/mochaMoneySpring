package com.example.mochamoneys.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoryinc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryInc_id;
    private String title;


    public long getCategoryIncId() {
        return categoryInc_id;
    }

    public void setCategoryIncId(long categoryIncId) {
        this.categoryInc_id = categoryIncId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
