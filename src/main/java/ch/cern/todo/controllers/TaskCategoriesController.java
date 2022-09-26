package ch.cern.todo.controllers;

import ch.cern.todo.models.TaskCategories;
import ch.cern.todo.repositories.ITaskCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task_categories")
public class TaskCategoriesController {

    @Autowired
    private ITaskCategoriesRepository taskCategoriesRepository;

    @GetMapping
    public List<TaskCategories> getAllTaskCategories() {
        return taskCategoriesRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public Optional<TaskCategories> getTaskCategoryById(@PathVariable int id) {
        return taskCategoriesRepository.findById(id);
    }

    @PostMapping
    TaskCategories createTaskCategory(@RequestBody TaskCategories taskCategory) {
        return taskCategoriesRepository.save(taskCategory);
    }

    @DeleteMapping(value="/{id}")
    public void deleteTaskCategoryById(@PathVariable int id) {
        if (taskCategoriesRepository.existsById(id))
            taskCategoriesRepository.deleteById(id);
    }

    // No Put (Update) code due to short interview and unrequested feature. This would essentially be done with
    // 1. @PutMapping 2. finding by ID 3. setting properties and returning .save(taskCategory)
}

