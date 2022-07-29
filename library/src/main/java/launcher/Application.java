package launcher;

import calculator.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(
                Double.parseDouble(args[0]),
                Double.parseDouble(args[1]));

        System.out.println(calculator.sum());
    }
}
