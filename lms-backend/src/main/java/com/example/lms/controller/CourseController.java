package com.example.lms.controller;

import com.example.lms.model.Course;
import com.example.lms.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService service;

    @GetMapping
    public List<Course> all() { return service.findAll(); }

    @PostMapping
    public Course create(@RequestBody Course c) { return service.create(c); }

    @GetMapping("/{id}")
    public Course get(@PathVariable Long id) { return service.findById(id); }

    @PutMapping("/{id}")
    public Course update(@PathVariable Long id, @RequestBody Course c) { return service.update(id, c); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
