import java.util.List;

public class SimpleAverageCalculator implements GradeCalculator {

    @Override
    public double calculate(List<Grade> grades) {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (Grade grade : grades) {
            total += grade.getPercentage();
        }

        return total / grades.size();
    }

    @Override
    public String getCalculatorName() {
        return "Simple Average";
    }
}