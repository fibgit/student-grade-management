package com.grademanagement.student_grade_api.controller;

import com.grademanagement.student_grade_api.model.Grade;
import com.grademanagement.student_grade_api.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grades")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping
    public List<Grade> getAllGrades() {
        return gradeService.getGrades();
    }

    @GetMapping("/student/{studentId}")
    public List<Grade> getGradesByStudent(@PathVariable String studentId) {
        return gradeService.getGradesByStudentId(studentId);
    }

    @PostMapping
    public ResponseEntity<Grade> createGrade(@RequestBody Grade grade) {
        boolean success = gradeService.addGrade(grade);
        if (success) {
            return ResponseEntity.ok(grade);
        }
        return ResponseEntity.badRequest().build();
    }
}