# Student Grade Management System

A Java console application for managing student grades, course information, and GPA calculations with multiple report format options.

## Project Overview

This project demonstrates practical application of Java object-oriented programming concepts including encapsulation, design patterns (Strategy Pattern), interface-based design, and professional software architecture. Built as a learning exercise to bridge the gap between theoretical Java knowledge and real-world application development.

## Features Implemented

### Phase 1 - Core Data Models ✅
- **Student Management**: Immutable student records with ID, name, and email
- **Course Catalog**: Course definitions with code, name, and credit hours
- **Grade Recording**: Assignment grades linking students to courses
- **Automatic Calculations**: Percentage calculations from raw scores
- **JUnit Testing**: Comprehensive test coverage for core functionality

### Phase 2 - Interactive Console Application ✅
- **Complete menu-driven interface** with 11 interactive options
- **Full CRUD operations** for students, courses, and grades
- **Robust input validation** with graceful error handling
- **Professional user experience** with clear prompts and feedback
- **Real-time interaction** - users can perform multiple operations in one session
- **Report Generation System** with multiple format options
- **Strategy Pattern Implementation** for flexible report formatting
- **Runtime format switching** - change report formats without restarting

## Current Functionality

### Core Operations
- Create, read, and manage students, courses, and grades
- Store grade information with automatic percentage calculation
- Display formatted student and grade information
- Search and filter by student ID or course code
- Validate data integrity before operations

### Report Generation (NEW!)
- **PDF Format**: Structured report with bullet points
- **HTML Format**: Web-ready report with HTML table formatting
- **Plain Text Format**: Clean, readable text with decorative borders
- **Runtime Format Selection**: Switch between formats dynamically
- **Student-specific Reports**: Generate detailed grade reports for any student

## Class Structure

### Core Models
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

### Report Formatting System (NEW!)
```
ReportFormatter (Interface)
├── formatReport(Student, List<Grade>)
└── getFormatName()

Implementations:
├── PDFReportFormatter
├── HTMLReportFormatter
└── TextReportFormatter

FlexibleReportGenerator
├── formatter: ReportFormatter
├── setFormatter(ReportFormatter)
├── generateReport(Student, List<Grade>)
└── getFormatterName()
```

## Design Principles Applied

- **Encapsulation**: Private fields with controlled access through getters
- **Immutability**: Core data cannot be modified after object creation
- **Single Responsibility**: Each class has one clear purpose
- **Strategy Pattern**: Runtime algorithm selection for report formatting
- **Open/Closed Principle**: Easy to extend with new formats without modifying existing code
- **Interface-Based Design**: Flexible, testable architecture
- **Data Integrity**: Relationships maintained through ID references rather than object references
- **Derived Data**: Percentages calculated on-demand rather than stored

## Getting Started

### Prerequisites
- Java 8 or higher
- IDE (IntelliJ IDEA recommended)
- Git for version control

### Running the Application
1. Clone the repository
   ```bash
   git clone https://github.com/fibgit/student-grade-management.git
   ```
2. Open in your Java IDE (IntelliJ IDEA recommended)
3. Run `GradeManagementSystem.java`
4. **Interact with the menu system:**
   - Options 1-3: View existing data
   - Options 4-6: Add new students, courses, and grades
   - Options 7-8: Search for specific records
   - **Option 9: Generate student reports** (NEW!)
   - **Option 10: Change report format** (NEW!)
   - Option 11: Exit the application

### Key Features
- **Input Validation**: Handles invalid menu choices and data entry gracefully
- **Error Prevention**: Validates student and course existence before adding grades
- **User-Friendly**: Clear prompts, helpful error messages, and intuitive navigation
- **Data Integrity**: Prevents duplicate student IDs and course codes
- **Professional Interface**: Consistent formatting and professional user experience
- **Flexible Reporting**: Multiple output formats for different use cases
- **Design Pattern Implementation**: Real-world Strategy Pattern in action

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
9. Generate Student Report          ← NEW!
10. Change Report Format            ← NEW!
11. Exit
Choose an option (1-11): _
```

### Feature Demonstrations

**Adding a New Student:**
```
Choose an option (1-11): 4
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
Choose an option (1-11): 7
Enter student ID: 
S001
Student found: Student{name='Alice Johnson', studentId='S001', email='alice@university.edu'}
```

**Generating a Report (NEW!):**
```
Choose an option (1-11): 9
Enter student ID: 
S001
Generating report using: PDF Format
----------------------------------------
=== PDF REPORT ===
Student: Alice Johnson
ID: S001
Email: alice@university.edu
Total Grades: 3

Grade Details:
- CS101: 87.5/100 (87.5%)
- CS101: 95.0/100 (95.0%)
- CS101: 92.0/100 (92.0%)
```

**Changing Report Format (NEW!):**
```
Choose an option (1-11): 10
=== Select Report Format ===
1. PDF Format
2. HTML Format
3. Plain Text Format
Choose format (1-3): 3
✓ Report format changed to: Plain Text Format
```

**HTML Format Example:**
```html
<html><body>
<h1>Student Report</h1>
<p><strong>Student:</strong> Alice Johnson</p>
<p><strong>ID:</strong> S001</p>
<table border='1'>
<tr><th>Course</th><th>Assignment</th><th>Score</th><th>Percentage</th></tr>
<tr><td>CS101</td><td>Midterm</td><td>87.5/100</td><td>87.5%</td></tr>
</table>
</body></html>
```

## Design Patterns Implemented

### Strategy Pattern (Report Formatting)
The report generation system uses the Strategy Pattern to allow runtime selection of formatting algorithms:

- **Context**: `FlexibleReportGenerator` holds a reference to a `ReportFormatter`
- **Strategy Interface**: `ReportFormatter` defines the contract
- **Concrete Strategies**: `PDFReportFormatter`, `HTMLReportFormatter`, `TextReportFormatter`
- **Benefits**:
   - Easy to add new formats (just create a new class)
   - Change formats at runtime without restarting
   - Each formatter is independently testable
   - Open/Closed Principle: extend without modifying existing code

## Planned Features (Upcoming Phases)

### Phase 3 - Spring Boot REST API ⏳
- [ ] Convert console app to web service
- [ ] RESTful API endpoints (GET, POST, PUT, DELETE)
- [ ] JSON request/response handling
- [ ] Postman testing integration
- [ ] HTTP status codes and error handling

### Phase 4 - Database Integration
- [ ] MySQL/PostgreSQL database connection
- [ ] Spring Data JPA repositories
- [ ] Database schema design
- [ ] CRUD operations with persistence
- [ ] Transaction management

### Phase 5 - Advanced Features
- [ ] GPA calculation (weighted by credits)
- [ ] Course statistics and analytics
- [ ] Grade letter assignment (A-F scale)
- [ ] API documentation (Swagger/OpenAPI)
- [ ] Input validation (@Valid annotations)

### Phase 6 - Testing & Quality
- [ ] JUnit tests for REST endpoints
- [ ] Integration testing
- [ ] Code coverage analysis
- [ ] Error handling improvements

## Learning Objectives

This project teaches practical application of:
- Object-oriented design principles
- Design patterns (Strategy Pattern)
- Interface-based architecture
- Java collections framework
- Professional code organization
- Exception handling strategies
- Version control with Git
- Software testing with JUnit
- RESTful API design (upcoming)
- Database integration (upcoming)

## Technology Stack

- **Language**: Java 17
- **IDE**: IntelliJ IDEA
- **Version Control**: Git & GitHub
- **Testing**: JUnit 5
- **Build Tool**: Maven (for Spring Boot phase)
- **Upcoming**: Spring Boot, Spring Data JPA, MySQL/PostgreSQL

## Development Environment

- **Development Approach**: Incremental phases with continuous testing
- **Code Quality**: Clean code principles, SOLID design
- **Architecture**: Separation of concerns (Models, Services, UI)
- **Version Control**: Feature-based commits with descriptive messages

## Project Progress

| Phase | Status | Features |
|-------|--------|----------|
| Phase 1 | ✅ Complete | Core models, CRUD operations, JUnit tests |
| Phase 2 | ✅ Complete | Interactive console, report formatters, Strategy Pattern |
| Phase 3 | ⏳ In Progress | Spring Boot REST API conversion |
| Phase 4 | 📋 Planned | Database integration (MySQL/PostgreSQL) |
| Phase 5 | 📋 Planned | Advanced features & analytics |
| Phase 6 | 📋 Planned | Comprehensive testing & deployment |

## Repository

GitHub: [https://github.com/fibgit/student-grade-management](https://github.com/fibgit/student-grade-management)

## Contributing

This is a learning project demonstrating progressive Java development from console application to enterprise-ready REST API. Each phase builds upon the previous foundation, showcasing increasingly complex software engineering concepts.

## Achievements

✅ Completed console application with full CRUD operations  
✅ Implemented professional design patterns (Strategy Pattern)  
✅ Built flexible, extensible architecture using interfaces  
✅ Demonstrated real-world software engineering practices  
✅ Maintained clean code and SOLID principles throughout

---

## Next Milestone

🎯 **Phase 3: Spring Boot REST API**
- Transform console app into web service
- RESTful endpoints for all operations
- JSON-based request/response
- Professional API architecture

---

*Built as part of a structured learning journey from Java fundamentals to enterprise application development. This project demonstrates the evolution from basic OOP concepts to professional software architecture patterns.*
