package com.luissilvacoding.listapp.task;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
@Schema(description = "Task entity stored in MongoDB")
public class Task {

    @Id
    @Schema(description = "MongoDB document id", example = "65f1c3a2d4e5f67890123456")
    private String id;

    @Schema(description = "Task title", example = "Buy groceries")
    private String title;

    @Schema(description = "Whether the task is completed", example = "false")
    private boolean done;

    public Task() {
    }

    public Task(String title, boolean done) {
        this.title = title;
        this.done = done;
    }

    public String getId() {
        return id;
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