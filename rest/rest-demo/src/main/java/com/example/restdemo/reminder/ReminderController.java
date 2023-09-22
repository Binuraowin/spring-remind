package com.example.restdemo.reminder;

import com.example.restdemo.jpa.AlienRepo;
import com.example.restdemo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReminderController {

    @Autowired
    AlienRepo repo;
    @GetMapping("aliens")
    public List<Alien> getList(){
        List<Alien> count = repo.findAll();
        return count;
    }

    @GetMapping("aliens/{id}")
    public Alien getAlien(@PathVariable("id") Long id){

        Alien alien = repo.findById(id).orElse(null);
        return alien;
    }

    @PostMapping("aliens")
    public Alien postAlien(@RequestBody Alien alien){

        repo.save(alien);
        return alien;
    }
}
