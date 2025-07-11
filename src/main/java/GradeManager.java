import java.util.*;

public class GradeManager {
    // Collections to store our data
    private List<Student> students;
    private Map<String, Course> courses; // courseCode -> Course
    private List<Grade> grades;

    // Constructor
    public GradeManager() {
        students = new ArrayList<>();
        courses = new HashMap<>();
        grades = new ArrayList<>();
    }

    // Add some sample data for testing
    public void loadSampleData() {
        // Add sample students
        students.add(new Student("Alice Johnson", "S001", "alice@university.edu"));
        students.add(new Student("Bob Smith", "S002", "bob@university.edu"));

        // Add sample courses
        courses.put("CS101", new Course("CS101", "Introduction to Programming", 3.0));
        courses.put("MATH201", new Course("MATH201", "Calculus I", 4.0));

        // Add sample grades
        grades.add(new Grade("S001", "CS101", "Midterm", 87.5, 100));
        grades.add(new Grade("S001", "CS101", "Homework 1", 95, 100));
        grades.add(new Grade("S002", "CS101", "Midterm", 78, 100));
    }

    // Display all students
    public void displayAllStudents() {
        System.out.println("\n=== All Students ===");
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Find student by ID (ArrayList search)
    public Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null; // Not found
    }

    // Find course by code (HashMap lookup - fast!)
    public Course findCourseByCode(String courseCode) {
        return courses.get(courseCode); // HashMap magic!
    }
    // Add a new student
    public boolean addStudent(Student student) {
        // Check if student ID already exists
        if (findStudentById(student.getStudentId()) != null) {
            System.out.println("Error: Student ID " + student.getStudentId() + " already exists!");
            return false;
        }

        students.add(student);
        System.out.println("Student added successfully: " + student.getName());
        return true;
    }

    // Add a new course
    public boolean addCourse(Course course) {
        // Check if course code already exists
        if (courses.containsKey(course.getCourseCode())) {
            System.out.println("Error: Course " + course.getCourseCode() + " already exists!");
            return false;
        }

        courses.put(course.getCourseCode(), course);
        System.out.println("Course added successfully: " + course.getCourseName());
        return true;
    }

}