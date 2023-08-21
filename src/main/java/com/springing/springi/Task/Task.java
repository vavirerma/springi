package com.springing.springi.Task;
import lombok.*;
import java.util.Date;
@AllArgsConstructor
@Getter
@Setter
public class Task {
    Integer id;
    String name;
    Date duplicate;
    Boolean completed;
}