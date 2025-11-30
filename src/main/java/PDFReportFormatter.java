import java.util.List;

public class PDFReportFormatter implements ReportFormatter {

    @Override
    public String formatReport(Student student, List<Grade> grades) {
        StringBuilder report = new StringBuilder();
        report.append("=== PDF REPORT ===\n");
        report.append("Student: ").append(student.getName()).append("\n");
        report.append("ID: ").append(student.getStudentId()).append("\n");
        report.append("Email: ").append(student.getEmail()).append("\n");
        report.append("Total Grades: ").append(grades.size()).append("\n");

        if (!grades.isEmpty()) {
            report.append("\nGrade Details:\n");
            for (Grade grade : grades) {
                if (grade.getStudentId().equals(student.getStudentId())) {
                    report.append("- ").append(grade.getCourseCode())
                            .append(": ").append(grade.getScore())
                            .append("/").append(grade.getMaxPoints())
                            .append(" (").append(String.format("%.1f%%", grade.getPercentage())).append(")\n");
                }
            }
        }

        return report.toString();
    }

    @Override
    public String getFormatName() {
        return "PDF Format";
    }
}
