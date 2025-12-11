package com.grademanagement.student_grade_api.controller;

import com.grademanagement.student_grade_api.model.Course;
import com.grademanagement.student_grade_api.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private GradeService gradeService;

    @GetMapping
    public List<Course> getAllCourses() {
        return gradeService.getAllCourses();
    }

    @GetMapping("/{code}")
    public ResponseEntity<Course> getCourseByCode(@PathVariable String code) {
        Course course = gradeService.findCourseByCode(code);
        if (course != null) {
            return ResponseEntity.ok(course);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        boolean success = gradeService.addCourse(course);
        if (success) {
            return ResponseEntity.ok(course);
        }
        return ResponseEntity.badRequest().build();
    }
}