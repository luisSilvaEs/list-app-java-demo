package com.luissilvacoding.listapp.task.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Request payload to update a task")
public class UpdateTaskRequest {

    @NotBlank
    @Schema(description = "Task title", example = "Buy groceries (updated)")
    private String title;

    @Schema(description = "Whether task is completed", example = "true")
    private boolean done;

    public UpdateTaskRequest() {
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