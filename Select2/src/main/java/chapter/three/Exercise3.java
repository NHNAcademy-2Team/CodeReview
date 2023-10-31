package chapter.three;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (x == 0) {
            return;
        }
        String operator = s.next();
        int y = s.nextInt();

        switch (operator) {
            case "*":
                System.out.println("= " + (x * y));
                break;
            case "/":
                System.out.println("= " + (x / y));
                break;
            case "+":
                System.out.println("= " + (x + y));
                break;
            case "-":
                System.out.println("= " + (x - y));
                break;
            case "%":
                System.out.println("= " + (x % y));
                break;
        }
    }
}
