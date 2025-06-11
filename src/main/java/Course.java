public class Course {

    private String CourseCode;
    private String CourseName;
    private double credits;

    public Course(String courseCode, String courseName, double credits) {
        this.CourseCode = courseCode;
        this.CourseName = courseName;
        this.credits = credits;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public double getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseCode='" + CourseCode + '\'' +
                ", CourseName='" + CourseName + '\'' +
                ", credits=" + credits +
                '}';
    }


}
