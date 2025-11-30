import java.util.Scanner;
import java.util.List;

public class ConsoleInterface {

    private GradeManager gradeManager;
    private Scanner scanner;
    private FlexibleReportGenerator reportGenerator;  // NEW: Add report generator

    public ConsoleInterface(){
        gradeManager = new GradeManager();
        scanner = new Scanner(System.in);
        reportGenerator = new FlexibleReportGenerator(new PDFReportFormatter());  // NEW: Initialize with PDF format

        // Load some sample data to start with
        gradeManager.loadSampleData();
    }


    public void start(){
        System.out.println("Welcome to Student Grade Management System!");
        System.out.println("=========================================");

        while (true){
            displayMenu();
            int choice = getUserChoice();

            if (choice == 11){  // CHANGED: Exit is now option 11
                System.out.println("Thank you for using Grade Management System!");
                break;
            }
            handleMenuChoice(choice);
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\n=== Student Grade Management System ===");
        System.out.println("1. Display All Students");
        System.out.println("2. Display All Courses");
        System.out.println("3. Display All Grades");
        System.out.println("4. Add New Student");
        System.out.println("5. Add New Course");
        System.out.println("6. Add New Grade");
        System.out.println("7. Find Student by ID");
        System.out.println("8. Find Course by Code");
        System.out.println("9. Generate Student Report");           // NEW: Report generation
        System.out.println("10. Change Report Format");             // NEW: Format selection
        System.out.println("11. Exit");                             // CHANGED: Exit moved to 11
        System.out.print("Choose an option (1-11): ");
    }

    private int getUserChoice() {

        while (true){

            try {

                String userInput = scanner.nextLine();
                int choice = Integer.parseInt(userInput);
                if(choice >= 1 && choice <= 11){  // CHANGED: Range now 1-11
                    return choice;
                }else {
                    System.out.println("Please enter a number between 1 and 11.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");;
            }
        }

    }

    private void handleMenuChoice(int choice) {
        System.out.println("You chose option " + choice);

        switch (choice) {
            case 1:
                gradeManager.displayAllStudents();
                break;
            case 2:
                gradeManager.displayAllCourses();
                break;
            case 3:
                gradeManager.displayAllGrades();
                break;
            case 4:
                addStudentFromInput();
                break;
            case 5:
                addCourseFromInput();
                break;
            case 6:
                addGradeFromInput();
                break;
            case 7:
                findStudentFromInput();
                break;
            case 8:
                findCourseFromInput();
                break;
            case 9:                          // NEW: Generate report
                generateReportFromInput();
                break;
            case 10:                         // NEW: Change format
                changeReportFormat();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

    }

    // NEW METHOD: Generate report for a student
    private void generateReportFromInput() {
        System.out.println("\n=== Generate Student Report ===");
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        Student student = gradeManager.findStudentById(studentId);
        if (student == null) {
            System.out.println("Student not found! Cannot generate report.");
            return;
        }

        // Get all grades for this student
        List<Grade> allGrades = gradeManager.getGrades();

        // Generate report using current formatter
        System.out.println("\nGenerating report using: " + reportGenerator.getFormatterName());
        System.out.println("----------------------------------------");
        String report = reportGenerator.generateReport(student, allGrades);
        System.out.println(report);
    }

    // NEW METHOD: Change report format
    private void changeReportFormat() {
        System.out.println("\n=== Select Report Format ===");
        System.out.println("1. PDF Format");
        System.out.println("2. HTML Format");
        System.out.println("3. Plain Text Format");
        System.out.print("Choose format (1-3): ");

        while (true) {
            try {
                String input = scanner.nextLine();
                int formatChoice = Integer.parseInt(input);

                if (formatChoice >= 1 && formatChoice <= 3) {
                    switch (formatChoice) {
                        case 1:
                            reportGenerator.setFormatter(new PDFReportFormatter());
                            System.out.println("✓ Report format changed to: PDF Format");
                            break;
                        case 2:
                            reportGenerator.setFormatter(new HTMLReportFormatter());
                            System.out.println("✓ Report format changed to: HTML Format");
                            break;
                        case 3:
                            reportGenerator.setFormatter(new TEXTReportFormatter());
                            System.out.println("✓ Report format changed to: Plain Text Format");
                            break;
                    }
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    // EXISTING METHODS BELOW (unchanged)

    private void addGradeFromInput() {
        System.out.println("Enter student ID: ");
        String studentId = scanner.nextLine();

        Student existingStudent = gradeManager.findStudentById(studentId);
        if (existingStudent == null) {
            System.out.println("Student not found! Cannot add grade.");
            return;
        }

        System.out.println("Enter course code: ");
        String courseCode = scanner.nextLine();

        Course existingCourse = gradeManager.findCourseByCode(courseCode);
        if (existingCourse == null) {
            System.out.println("Course not found! Cannot add grade.");
            return;
        }

        System.out.println("Enter assignment name: ");
        String assignmentName = scanner.nextLine();

        System.out.println("Enter score: ");
        String assignmentScore = scanner.nextLine();
        double score = Double.parseDouble(assignmentScore);

        System.out.println("Enter max points: ");
        String points = scanner.nextLine();
        double maxPoints = Double.parseDouble(points);

        Grade grade = new Grade(studentId,courseCode,assignmentName,score,maxPoints);
        boolean success = gradeManager.addGrade(grade);
        if (success) {
            System.out.println("Grade recorded successfully!");
        }

    }

    private void addCourseFromInput() {
        System.out.println("Enter course code: ");
        String courseCode = scanner.nextLine();

        System.out.println("Enter course name: ");
        String courseName = scanner.nextLine();

        System.out.println("Enter Credits: ");
        String creditsInput = scanner.nextLine();
        double credits = Double.parseDouble(creditsInput);

        Course course = new Course(courseCode, courseName, credits);
        boolean success = gradeManager.addCourse(course);

        if(success){
            System.out.println("Added new course : " + course);
        } else {
            System.out.println("Failed to add course (course does not exist");
        }

    }

    private void addStudentFromInput() {
        System.out.println("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.println("Enter student ID: ");
        String studentId = scanner.nextLine();

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        Student newStudent = new Student(studentName,studentId,email);
        boolean success = gradeManager.addStudent(newStudent);

        if (success) {
            System.out.println("Added new student : " + newStudent);
        } else {
            System.out.println("Failed to add student (ID might already exist)");
        }

    }

    private void findStudentFromInput(){
        System.out.println("Enter student ID: ");
        String studentId = scanner.nextLine();
        Student found = gradeManager.findStudentById(studentId);
        if (found != null) {
            System.out.println("Student found: " + found);
        } else {
            System.out.println("Student with ID " + studentId + " not found");
        }

    }

    private void findCourseFromInput(){
        System.out.println("Enter course code");
        String courseCode = scanner.nextLine();
        Course found = gradeManager.findCourseByCode(courseCode);
        if (found != null) {
            System.out.println("Course found: " + found);
        } else {
            System.out.println("Course with code " + courseCode + " not found");
        }
    }

}