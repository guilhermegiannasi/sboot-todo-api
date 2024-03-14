package com.todo.service;

import com.todo.model.Task;
import com.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> findAll(){
        return repository.findAll();
    }
    public Task findById(Long id){
        return repository.findById(id).orElse(null);
    }
    public Task save(Task task){
        return repository.save(task);
    }
    public void deleteById(Long id){
        Optional<Task> taskOptional = repository.findById(id);
        if(taskOptional.isPresent()){
            Task task = taskOptional.get();
            task.setDeleted(true);
            repository.save(task);
        }
    }

}
