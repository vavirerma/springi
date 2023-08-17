package com.springing.springi.Task;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    List<Task> taskList=new ArrayList<>();

    private int nextTaskid=1;
    @GetMapping("")
    public List<Task>  getAllTasks(){
        return taskList;
    }

    @PostMapping
    Task createTask(@RequestBody Task task)
    {
        task.setID(nextTaskid++);
        taskList.add(task);
        return task;
    }
    @GetMapping("/id")
    Task getTaskId(@PathVariable("id") Integer id){
        Task foundtask=taskList.stream().filter(task -> task.getID().equals(id)).findFirst().orElse(null);
        return foundtask;
    }

}
