package com.developer.Task.controller;



import com.developer.Task.entity.TaskEntity;
import com.developer.Task.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tabela_testowa")
public class ApiController {

    private final TaskService taskService;

    public ApiController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<TaskEntity> findAllRows() {
        return taskService.findAllRow();
    }

    @GetMapping("/{id}")
    public Optional<TaskEntity> findRowById(@PathVariable("id") Long id) {
        return taskService.findById(id);
    }

    @GetMapping("/unique/{columna}")
    public List<TaskEntity> finduni(@PathVariable("columna") String kolumna) {
        return taskService.findunique(kolumna);
    }
    @GetMapping("/nounique/{columna}")
    public List<TaskEntity> findnouni(@PathVariable("columna") String kolumna) {
        return taskService.findnounique(kolumna);
    }



}
