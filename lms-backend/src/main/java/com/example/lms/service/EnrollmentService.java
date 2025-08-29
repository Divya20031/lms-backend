package com.example.lms.service;

import com.example.lms.model.Enrollment;
import com.example.lms.repository.EnrollmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EnrollmentService {
    private final EnrollmentRepository repo;

    public List<Enrollment> all() { return repo.findAll(); }

    public Enrollment enroll(Enrollment e) {
        e.setEnrolledAt(LocalDateTime.now());
        if (e.getProgress() == null) e.setProgress(0.0);
        return repo.save(e);
    }
}
