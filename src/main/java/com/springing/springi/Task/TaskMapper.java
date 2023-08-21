package com.springing.springi.Task;

import com.springing.springi.Task.DTOs.CreateTaskDTO;

import java.util.Date;

public class TaskMapper
{
    public CreateTaskDTO createTaskDTO(String name, Date duplicate )
    {
        CreateTaskDTO createTaskDTO = new CreateTaskDTO();
        createTaskDTO.setName(name);
        createTaskDTO.setDuplicate(duplicate);
        return createTaskDTO;
    }
}
