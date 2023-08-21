package com.springing.springi.Task;


import com.springing.springi.Task.DTOs.CreateTaskDTO;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController
{

    private final TaskService taskService;
    public TaskController(TaskService taskService)
    {
        this.taskService=taskService;
    }
    @GetMapping("")
    ResponseEntity<List<Task>> getAllTasks()
    {
        List<Task> tasks=taskService.getTaskList();
        return ResponseEntity.ok(tasks);
    }
    @PostMapping("")
    ResponseEntity<Task> createTask(@RequestBody CreateTaskDTO createTaskDTO)
    {
        Task createdTask = taskService.createTask(createTaskDTO.getName(), createTaskDTO.getDuplicate());
        return ResponseEntity.ok(createdTask);
    }
    @GetMapping("/id")
    ResponseEntity<Task> getTaskByID(@PathVariable("id") Integer id)
    {
        Task task=taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }
    @ExceptionHandler(TaskService.TaskNotFoundException.class)
    ResponseEntity<String> handleTaskNotFoundException(TaskService.TaskNotFoundException e) {
        return ResponseEntity.notFound().build();
    }

}
