package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sharing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSharing;

    public long getIdSharing() {
        return idSharing;
    }

    public void setIdSharing(long idSharing) {
        this.idSharing = idSharing;
    }
}
