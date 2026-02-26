package com.luissilvacoding.listapp.task;

import com.luissilvacoding.listapp.task.dto.CreateTaskRequest;
import com.luissilvacoding.listapp.task.dto.UpdateTaskRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/tasks")
@Tag(name = "Tasks", description = "CRUD operations for tasks")
public class TaskController {

    private final TaskRepository repo;

    public TaskController(TaskRepository repo) {
        this.repo = repo;
    }

    @Operation(summary = "Create a task")
    @PostMapping
    public ResponseEntity<Task> create(@Valid @RequestBody CreateTaskRequest body) {
        Task created = repo.save(new Task(body.getTitle(), body.isDone()));
        return ResponseEntity
                .created(URI.create("/tasks/" + created.getId()))
                .body(created);
    }

    @Operation(summary = "List all tasks")
    @GetMapping
    public List<Task> list() {
        return repo.findAll();
    }

    @Operation(summary = "Get a task by id")
    @GetMapping("/{id}")
    public ResponseEntity<Task> get(@PathVariable String id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Update a task by id")
    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@PathVariable String id, @Valid @RequestBody UpdateTaskRequest body) {
        return repo.findById(id).map(existing -> {
            existing.setTitle(body.getTitle());
            existing.setDone(body.isDone());
            Task updated = repo.save(existing);
            return ResponseEntity.ok(updated);
        }).orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Delete a task by id")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        if (!repo.existsById(id))
            return ResponseEntity.notFound().build();
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}