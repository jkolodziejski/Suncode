package com.developer.Task.service;


import com.developer.Task.entity.TaskEntity;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<TaskEntity> findAllRow();
    Optional<TaskEntity> findById(Long id);

    List<TaskEntity> findunique(String kolumna);

    List<TaskEntity> findnounique(String kolumna);
}
