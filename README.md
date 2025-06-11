# Student Grade Management System

A Java console application for managing student grades, course information, and GPA calculations.

## Project Overview

This project demonstrates practical application of Java object-oriented programming concepts including encapsulation, immutable design patterns, and class relationships. Built as a learning exercise to bridge the gap between theoretical Java knowledge and real-world application development.

## Features Implemented

### Phase 1 - Core Data Models ✅
- **Student Management**: Immutable student records with ID, name, and email
- **Course Catalog**: Course definitions with code, name, and credit hours
- **Grade Recording**: Assignment grades linking students to courses
- **Automatic Calculations**: Percentage calculations from raw scores

## Current Functionality

- Create student, course, and grade objects
- Store grade information with automatic percentage calculation
- Display formatted student and grade information
- Immutable design ensures data integrity

## Class Structure

```
Student
├── name (String)
├── studentId (String)
└── email (String)

Course  
├── courseCode (String)
├── courseName (String)
└── credits (double)

Grade
├── studentId (String) 
├── courseCode (String)
├── assignmentName (String)
├── score (double)
├── maxPoints (double)
└── getPercentage() -> calculated
```

## Design Principles Applied

- **Encapsulation**: Private fields with controlled access through getters
- **Immutability**: Core data cannot be modified after object creation
- **Single Responsibility**: Each class has one clear purpose
- **Data Integrity**: Relationships maintained through ID references rather than object references
- **Derived Data**: Percentages calculated on-demand rather than stored

## Getting Started

### Prerequisites
- Java 8 or higher
- IDE (IntelliJ IDEA recommended)

### Running the Application
1. Clone the repository
2. Open in your Java IDE
3. Run `GradeManagementSystem.java`

### Sample Output
```
=== Student Grade Management System Test ===

Student: Student{name='Alice Johnson', studentId='S001', email='alice@university.edu'}
Course: Course{courseCode='CS101', courseName='Introduction to Programming', credits=3.0}

Grades:
Grade{studentId='S001', courseCode='CS101', assignmentName='Midterm Exam', score=87.5, maxPoints=100.0, percentage=87.5%}
Grade{studentId='S001', courseCode='CS101', assignmentName='Homework 1', score=95.0, maxPoints=100.0, percentage=95.0%}
Grade{studentId='S001', courseCode='CS101', assignmentName='Final Project', score=92.0, maxPoints=100.0, percentage=92.0%}
```

## Planned Features (Upcoming Phases)

### Phase 2 - Basic Operations
- [ ] Add/remove students and courses
- [ ] Record grades for students
- [ ] Console menu system
- [ ] Input validation and error handling

### Phase 3 - Advanced Calculations
- [ ] GPA calculation (weighted by credits)
- [ ] Course averages for individual students
- [ ] Class statistics and reporting
- [ ] Grade letter assignment (A-F scale)

### Phase 4 - Data Persistence
- [ ] Save/load data from files
- [ ] Data backup functionality
- [ ] Handle file I/O errors gracefully

### Phase 5 - Enhanced Features
- [ ] Search and filter functionality
- [ ] Multiple semester support
- [ ] Grade history tracking
- [ ] Import/export capabilities

## Learning Objectives

This project teaches practical application of:
- Object-oriented design principles
- Java collections framework
- File I/O operations
- Exception handling strategies
- Software design patterns
- Version control with Git

## Development Environment

- **Language**: Java
- **IDE**: IntelliJ IDEA
- **Version Control**: Git & GitHub
- **Development Approach**: Incremental phases with continuous testing

## Contributing

This is a learning project. Each phase builds upon the previous foundation, demonstrating progressive complexity in Java application development.

---

*Built as part of a structured learning approach to bridge theoretical Java knowledge with practical application development.*
