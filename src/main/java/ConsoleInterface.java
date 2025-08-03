import java.util.Scanner;

public class ConsoleInterface {

    private GradeManager gradeManager;
    private Scanner scanner;

    public ConsoleInterface(){
        gradeManager = new GradeManager();
        scanner = new Scanner(System.in);

        // Load some sample data to start with
        gradeManager.loadSampleData();
    }


    public void start(){
        System.out.println("Welcome to Student Grade Management System!");
        System.out.println("=========================================");

        while (true){
            displayMenu();
            int choice = getUserChoice();

            if (choice == 9){
                System.out.println("Thank you for using Grade Management System!");
                break;
            }
            handleMenuChoice(choice);
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("=== Student Grade Management System ===");
        System.out.println("1. Display All Students");
        System.out.println("2. Display All Courses");
        System.out.println("3. Display All Grades");
        System.out.println("4. Add New Student");
        System.out.println("5. Add New Course");
        System.out.println("6. Add New Grade");
        System.out.println("7. Find Student by ID");
        System.out.println("8. Find Course by Code");
        System.out.println("9. Exit");
        System.out.print("Choose an option (1-9): ");
    }

    private int getUserChoice() {

        while (true){

            try {

                String userInput = scanner.nextLine();
                int choice = Integer.parseInt(userInput);
                    if(choice >= 1 && choice <= 9){
                        return choice;
                    }else {
                        System.out.println("Please enter a number between 1 and 9.");
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
            default:
                System.out.println("Invalid choice. Please try again.");
        }

    }

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
