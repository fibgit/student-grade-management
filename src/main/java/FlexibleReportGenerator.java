import java.util.List;

public class FlexibleReportGenerator {
    private ReportFormatter formatter;

    public FlexibleReportGenerator(ReportFormatter formatter) {
        this.formatter = formatter;
    }

    public void setFormatter(ReportFormatter formatter) {
        this.formatter = formatter;
    }

    public String generateReport(Student student, List<Grade> grades) {
        return formatter.formatReport(student, grades);
    }

    public String getFormatterName() {
        return formatter.getFormatName();
    }

}
