package com.springing.springi.Task;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TaskService
{
    List<Task> taskList=new ArrayList<>();

    private int nextTaskid=0;

    public List<Task> getTaskList()
    {
        return taskList;
    }
    public Task getTaskById(Integer id)
    {
        //Task foundtask=taskList.stream().filter(task -> task.getId().equals(id)).findFirst().orElse(null);
        for(Task task:taskList)
        {
            if(task.getId().equals(id))
            {
                return task;
            }
        }
        throw new TaskNotFoundException(id);
    }

    public Task createTask(String name, Date duplicate)
    {
        Task task = new Task(nextTaskid++, name, duplicate, false);
        taskList.add(task);
        return task;
    }


    public Task updateTask(Integer id,Date duplicate,Boolean completed)
    {
        Task task=getTaskById(id);
        if(duplicate!=null)
        {
            task.setDuplicate(duplicate);
        }
        if(completed!=null)
        {
            task.setCompleted(completed);
        }
        return task;
    }
    public void deleteTask(Integer id)
    {
        Task task=getTaskById(id);
        taskList.remove(task);
    }

    public static class TaskNotFoundException extends IllegalStateException
    {
        public TaskNotFoundException(Integer id)
        {
            super("Task with id " + id + " not found.");
        }
    }
}

