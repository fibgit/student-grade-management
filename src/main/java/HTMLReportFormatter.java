import java.util.List;

public class HTMLReportFormatter implements ReportFormatter{

    @Override
    public String formatReport(Student student, List<Grade> grades) {

        StringBuilder report = new StringBuilder();
        report.append("<html><body>\n");
        report.append("<h1>Student Report</h1>\n");
        report.append("<p><strong>Student:</strong> ").append(student.getName()).append("</p>\n");
        report.append("<p><strong>ID:</strong> ").append(student.getStudentId()).append("</p>\n");
        report.append("<p><strong>Email:</strong> ").append(student.getEmail()).append("</p>\n");
        report.append("<p><strong>Total Grades:</strong> ").append(grades.size()).append("</p>\n");;


        if (!grades.isEmpty()) {
            report.append("<h2>Grade Details</h2>\n");
            report.append("<ul>\n");
            for (Grade grade : grades) {
                if (grade.getStudentId().equals(student.getStudentId())) {
                    report.append("<li>").append(grade.getCourseCode())
                            .append(": ").append(grade.getScore())
                            .append("/").append(grade.getMaxPoints())
                            .append(" (<strong>").append(String.format("%.1f%%", grade.getPercentage())).append("</strong>)</li>\n");
                }
            }
            report.append("</ul>\n");
        }

        report.append("</body></html>");
        return report.toString();
    }

    @Override
    public String getFormatName() {
        return "PDF Format";
    }

}
