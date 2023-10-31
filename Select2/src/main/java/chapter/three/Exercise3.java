package chapter.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiFunction;

public class Exercise3 {
    public static void main(String[] args) {
        evalutionExpression();
    }

    private static void evalutionExpression() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (!(line = br.readLine()).equals("0")) {
                String[] arg = line.split(" ");
                double x = Double.parseDouble(arg[0]);
                String operator = arg[1];
                double y = Double.parseDouble(arg[2]);
                System.out.println(Operator.find(operator).calculator(x, y));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
enum Operator {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    MULTIPLY("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private String operator;
    private BiFunction<Double, Double, Double> expression;

    Operator(String operator, BiFunction<Double, Double, Double> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public double calculator(double x, double y) {
        return expression.apply(x, y);
    }

    public static Operator find(String operator) {
        return Arrays.stream(values())
                .filter(operation -> operation.operator.equals(operator))
                .findAny().orElseThrow(() -> new IllegalArgumentException("잘못된 연산자 입니다."));
    }
}
