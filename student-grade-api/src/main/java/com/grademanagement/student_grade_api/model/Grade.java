package com.grademanagement.student_grade_api.model;

public class Grade {
    private String studentId;
    private String courseCode;
    private String assignmentName;
    private double score;
    private double maxPoints;

    public Grade(String studentId, String courseCode, String assignmentName, double score, double maxPoints) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.assignmentName = assignmentName;
        this.score = score;
        this.maxPoints = maxPoints;
    }

    // Getters
    public String getStudentId() { return studentId; }
    public String getCourseCode() { return courseCode; }
    public String getAssignmentName() { return assignmentName; }
    public double getScore() { return score; }
    public double getMaxPoints() { return maxPoints; }

    // Calculated method
    public double getPercentage() {
        return (score / maxPoints) * 100;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "studentId='" + studentId + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", assignmentName='" + assignmentName + '\'' +
                ", score=" + score +
                ", maxPoints=" + maxPoints +
                ", percentage=" + String.format("%.1f", getPercentage()) + "%" +
                '}';
    }
}
