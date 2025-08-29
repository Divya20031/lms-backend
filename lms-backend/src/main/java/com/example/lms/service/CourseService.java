package com.example.lms.service;

import com.example.lms.model.Course;
import com.example.lms.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository repo;

    public List<Course> findAll() { return repo.findAll(); }
    public Course create(Course c) { return repo.save(c); }
    public Course findById(Long id) { return repo.findById(id).orElseThrow(); }
    public Course update(Long id, Course in) {
        Course c = findById(id);
        c.setTitle(in.getTitle());
        c.setDescription(in.getDescription());
        c.setPrice(in.getPrice());
        return repo.save(c);
    }
    public void delete(Long id) { repo.deleteById(id); }
}
