package com.grademanagment.student_grade_api.model;

public class Student {

    private String name;
    private String studentId;
    private String email;

    public Student(String studentId) {
    }


    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public Student(String name, String studentId, String email){
        this.name  = name;
        this.studentId = studentId;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
