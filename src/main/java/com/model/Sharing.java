package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sharing {
    @Id
    private long idSharing;

    public long getIdSharing() {
        return idSharing;
    }

    public void setIdSharing(long idSharing) {
        this.idSharing = idSharing;
    }
}
