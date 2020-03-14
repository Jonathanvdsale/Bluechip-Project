package com.example.demo;

import com.example.model.Task;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    //allows the website to be accessed by the use of @crossorigin
    @CrossOrigin
    @GetMapping("/")
    Task getFirstTask(){
        Task task = new Task();

        task.setName("Create react app");
        task.setDescription("Create a new react app from scratch");

        return task;
    }
    @CrossOrigin
    @GetMapping("/tasks")
    String getTask(){
        return  "Finish bootcamp";
    }




}
