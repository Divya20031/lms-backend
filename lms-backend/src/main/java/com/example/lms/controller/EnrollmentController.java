package com.example.lms.controller;

import com.example.lms.model.Enrollment;
import com.example.lms.service.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
@RequiredArgsConstructor
public class EnrollmentController {
    private final EnrollmentService service;

    @GetMapping
    public List<Enrollment> all() { return service.all(); }

    @PostMapping
    public Enrollment enroll(@RequestBody Enrollment e) { return service.enroll(e); }
}
