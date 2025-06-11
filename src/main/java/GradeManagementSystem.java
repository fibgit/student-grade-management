public class GradeManagementSystem {

    public static void main(String[] args) {

        // Create a student
        Student student1 = new Student("Alice Johnson", "S001", "alice@university.edu");

        // Create a course
        Course course1 = new Course("CS101", "Introduction to Programming", 3.0);

        // Create some grades for this student in this course
        Grade midterm = new Grade("S001", "CS101", "Midterm Exam", 87.5, 100);
        Grade homework1 = new Grade("S001", "CS101", "Homework 1", 95, 100);
        Grade project = new Grade("S001", "CS101", "Final Project", 92, 100);

        // Display everything
        System.out.println("=== Student Grade Management System Test ===");
        System.out.println("\nStudent: " + student1);
        System.out.println("Course: " + course1);

        System.out.println("\nGrades:");
        System.out.println(midterm);
        System.out.println(homework1);
        System.out.println(project);

        // Test our percentage calculation
        System.out.println("\nGrade Percentages:");
        System.out.println("Midterm: " + String.format("%.1f%%", midterm.getPercentage()));
        System.out.println("Homework 1: " + String.format("%.1f%%", homework1.getPercentage()));
        System.out.println("Project: " + String.format("%.1f%%", project.getPercentage()));

    }
}
