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

### Phase 1 - Core Data Models ✅
- Create student, course, and grade objects
- Store grade information with automatic percentage calculation
- Display formatted student and grade information
- Immutable design ensures data integrity

### Phase 2 - Interactive Console Application ✅
- **Complete menu-driven interface** with 9 interactive options
- **Full CRUD operations** for students, courses, and grades
- **Robust input validation** with graceful error handling
- **Professional user experience** with clear prompts and feedback
- **Real-time interaction** - users can perform multiple operations in one session

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
2. Open in your Java IDE (IntelliJ IDEA recommended)
3. Run `GradeManagementSystem.java`
4. **Interact with the menu system:**
    - Use options 1-3 to view existing data
    - Use options 4-6 to add new students, courses, and grades
    - Use options 7-8 to search for specific records
    - Use option 9 to exit the application

### Key Features
- **Input Validation**: Handles invalid menu choices and data entry gracefully
- **Error Prevention**: Validates student and course existence before adding grades
- **User-Friendly**: Clear prompts, helpful error messages, and intuitive navigation
- **Data Integrity**: Prevents duplicate student IDs and course codes
- **Professional Interface**: Consistent formatting and professional user experience

### Interactive Menu System
```
Welcome to Student Grade Management System!
=========================================

=== Student Grade Management System ===
1. Display All Students
2. Display All Courses
3. Display All Grades
4. Add New Student
5. Add New Course
6. Add New Grade
7. Find Student by ID
8. Find Course by Code
9. Exit
Choose an option (1-9): _
```

### Feature Demonstrations

**Adding a New Student:**
```
Choose an option (1-9): 4
Enter student name: 
John Doe
Enter student ID: 
S003
Enter email: 
john@university.edu
Added new student: Student{name='John Doe', studentId='S003', email='john@university.edu'}
```

**Finding a Student:**
```
Choose an option (1-9): 7
Enter student ID: 
S001
Student found: Student{name='Alice Johnson', studentId='S001', email='alice@university.edu'}
```

**Adding a Grade:**
```
Choose an option (1-9): 6
Enter student ID: 
S001
Enter course code: 
CS101
Enter assignment name: 
Final Exam
Enter score: 
88.5
Enter max points: 
100
Grade recorded successfully!
```

## Planned Features (Upcoming Phases)

### Phase 3 - Advanced Calculations ⏳
- [ ] GPA calculation (weighted by credits)
- [ ] Course averages for individual students
- [ ] Class statistics and reporting
- [ ] Grade letter assignment (A-F scale)
- [ ] Semester/term organization
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