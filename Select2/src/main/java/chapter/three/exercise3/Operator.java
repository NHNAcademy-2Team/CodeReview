package chapter.three.exercise3;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
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
