package com.springing.springi.Task.DTOs;

import lombok.Data;

import java.util.Date;
@Data
public class UpdateTaskDTO
{
    Date duplicate;
    Boolean completed;
}
