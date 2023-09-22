package com.example.restdemo.reminder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReminderController {
    @GetMapping("aliens")
    @ResponseBody
    public List<String> getList(){
        List<String> count = new ArrayList<>();
        count.add("re");
        count.add("er");
        count.add("wwq");
        return count;
    }

    @GetMapping("aliens/{id}")
    @ResponseBody
    public int getAlien(@PathVariable("id") int id){
        return id;
    }
}
