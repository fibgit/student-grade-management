import java.util.List;

public class TEXTReportFormatter implements ReportFormatter{

    @Override
    public String formatReport(Student student, List<Grade> grades) {
        StringBuilder report = new StringBuilder();

        // Simple text header
        report.append("========================================\n");
        report.append("         STUDENT GRADE REPORT          \n");
        report.append("========================================\n\n");

        // Student Information
        report.append("Student Name: ").append(student.getName()).append("\n");
        report.append("Student ID:   ").append(student.getStudentId()).append("\n");
        report.append("Email:        ").append(student.getEmail()).append("\n");
        report.append("\n");

        // Grade Summary
        report.append("----------------------------------------\n");
        report.append("Grade Summary\n");
        report.append("----------------------------------------\n");
        report.append("Total Grades: ").append(grades.size()).append("\n\n");


        // Grade Summary
        report.append("----------------------------------------\n");
        report.append("Grade Summary\n");
        report.append("----------------------------------------\n");
        report.append("Total Grades: ").append(grades.size()).append("\n\n");

        // Grade Details
        if (!grades.isEmpty()) {
            report.append("Detailed Grades:\n\n");

            int count = 1;
            for (Grade grade : grades) {
                if (grade.getStudentId().equals(student.getStudentId())) {
                    report.append(count++).append(". ");
                    report.append("Course: ").append(grade.getCourseCode()).append("\n");
                    report.append("   Assignment: ").append(grade.getAssignmentName()).append("\n");
                    report.append("   Score: ").append(grade.getScore())
                            .append("/").append(grade.getMaxPoints());
                    report.append(" (").append(String.format("%.1f%%", grade.getPercentage())).append(")\n\n");
                }
            }
        } else {
            report.append("No grades recorded yet.\n");
        }

        report.append("========================================\n");
        report.append("         END OF REPORT                  \n");
        report.append("========================================\n");

        return report.toString();
    }

    @Override
    public String getFormatName() {
        return "Plain Text Format";
    }
}
