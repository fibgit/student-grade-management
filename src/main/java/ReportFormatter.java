import java.util.List;

public interface ReportFormatter {

    String formatReport(Student student, List<Grade> grades);
    String getFormatName();
}
