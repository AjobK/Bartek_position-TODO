package ch.cern.todo.controllers;

import ch.cern.todo.models.Tasks;
import ch.cern.todo.repositories.ITasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    @Autowired
    private ITasksRepository tasksRepository;

    @GetMapping
    public List<Tasks> getAllTasks() {
        return tasksRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public Optional<Tasks> getTaskById(@PathVariable int id) {
        return tasksRepository.findById(id);
    }

    @PostMapping
    Tasks createTask(@RequestBody Tasks task) {
        return tasksRepository.save(task);
    }

    @DeleteMapping(value="/{id}")
    public void deleteTaskById(@PathVariable int id) {
        if (tasksRepository.existsById(id))
            tasksRepository.deleteById(id);
    }

    // No Put (Update) code due to short interview and unrequested feature. This would essentially be done with
    // 1. @PutMapping 2. finding by ID 3. setting properties and returning .save(task)
}

