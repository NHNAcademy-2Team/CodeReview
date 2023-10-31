package chapter.three;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String expression = sc.nextLine();
            System.out.println(SimpleCalculator.calculator(expression));
        }
    }
}

class SimpleCalculator{

    public static double calculator(String expression){
        String[] arrays = expression.split(" ");
        double result = Double.parseDouble(arrays[0]);

        for (int i = 1; i < arrays.length; i += 2) {
            switch (arrays[i]){
                case "+":
                    result += Double.parseDouble(arrays[i+1]);
                    break;
                case "-":
                    result -= Double.parseDouble(arrays[i+1]);
                    break;
                case "*":
                    result *= Double.parseDouble(arrays[i+1]);
                    break;
                case "/":
                    result /= Double.parseDouble(arrays[i+1]);
            }
        }
        return result;
    }
}
