package com.luissilvacoding.listapp.task.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Request payload to create a task")
public class CreateTaskRequest {

    @NotBlank
    @Schema(description = "Task title", example = "Learn Spring Boot + Mongo")
    private String title;

    @Schema(description = "Whether task is completed", example = "false")
    private boolean done;

    public CreateTaskRequest() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}