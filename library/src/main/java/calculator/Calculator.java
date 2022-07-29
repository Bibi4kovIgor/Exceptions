package calculator;

public class Calculator implements Calc{
    private final double x;
    private final double y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double sum() {
        return x + y;
    }
}
