package com.springing.springi.Task;

import java.util.Date;

public class Task
{
    Integer id;
    String name;
    Date duplicate;
    boolean completed;

    public Task(Integer id,String name,Date duplicate,boolean completed)
    {
        this.id=id;
        this.name=name;
        this.duplicate=duplicate;
        this.completed=completed;
    }
    public Integer getID()
    {
        return this.id;
    }
    public void setID(Integer id)
    {
        this.id=id;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setDate(Date duplicate)
    {
        this.duplicate=duplicate;
    }
    public Date getDate()
    {
        return this.duplicate;
    }
    public boolean getCompleted()
    {
        return this.completed;
    }
    public void setCompleted(boolean completed)
    {
        this.completed=completed;
    }
}
