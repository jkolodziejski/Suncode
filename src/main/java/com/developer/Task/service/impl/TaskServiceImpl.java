package com.developer.Task.service.impl;

import com.developer.Task.entity.TaskEntity;
import com.developer.Task.repository.TaskRepository;
import com.developer.Task.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository employeeRepository) {
        this.taskRepository = employeeRepository;
    }

    @Override
    public List<TaskEntity> findAllRow() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<TaskEntity> findById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public List<TaskEntity> findunique(String columna) {
      switch (columna){
          case "kolumna1":
              return taskRepository.UniqueKolumna1();
          case "kolumna2":
              return taskRepository.UniqueKolumna2();

          case "kolumna3":
              return taskRepository.UniqueKolumna3();

          case "kolumna4":
              return taskRepository.UniqueKolumna4();

      }

      return null;


    }


    @Override
    public List<TaskEntity> findnounique(String columna) {
        switch (columna){
            case "kolumna1":
                return taskRepository.NoUniqueKolumna1();
            case "kolumna2":
                return taskRepository.NoUniqueKolumna2();

            case "kolumna3":
                return taskRepository.NoUniqueKolumna3();

            case "kolumna4":
                return taskRepository.NoUniqueKolumna4();

        }

        return null;
    }


}
