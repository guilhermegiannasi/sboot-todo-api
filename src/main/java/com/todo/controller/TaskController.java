package com.todo.controller;

import com.todo.model.Task;
import com.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping
    public List<Task> findAll(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Task findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping("/save")
    public Task save(@RequestBody Task task){
        return service.save(task);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }


}
