package chapter.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {

    public static void main(String[] args) {
        inputCalc();
    }

    public static void inputCalc() {
        StatCalc calc = new StatCalc();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            boolean inputZero = true;

            while (inputZero) {
                System.out.print("> ");
                String input = br.readLine();

                if (input.equals("0")) {
                    inputZero = false;
                } else if (isDouble(input)) {
                    double item = Double.parseDouble(input);
                    calc.enter(item);
                }
            }

            printCalc(calc);

        } catch (IOException e) {
            e.getMessage();
        }

    }

    public static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public static void printCalc(StatCalc calc) {
        System.out.println(calc.getCount());
        System.out.println(calc.getSum());
        System.out.println(calc.getMean());
        System.out.println(calc.getStandardDeviation());
        System.out.println(calc.getMax());
        System.out.println(calc.getMin());
    }

}
