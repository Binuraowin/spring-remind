package com.example.restdemo.jpa;

import com.example.restdemo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepo extends JpaRepository<Alien, Long> {
    // You can add custom query methods here if needed
}