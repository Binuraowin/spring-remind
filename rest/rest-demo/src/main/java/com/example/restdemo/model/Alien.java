package com.example.restdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    public Long id;
    public String name;

    public Alien(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Alien() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
