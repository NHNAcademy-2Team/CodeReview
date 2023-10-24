package unit.eight;

import java.util.Scanner;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni08/node24.html
 * Exercise 08.2 Write a public static method that reads from the keyboard a sequence of positive integers until the value 0 is inserted, and returns a double representing the average of the read values (without considering the final 0).
 */
public class Exercise2 {
    public static void main(String[] args) {
        try {
            System.out.println(averageUntilZero());
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double averageUntilZero() {
        double sum = 0;
        double count = 0;
        double result;
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                double num = sc.nextInt();
                if (num > 0) {
                    sum += num;
                    count++;
                } else if (num == 0) {
                    break;
                } else {
                    throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
                }
            }
        }
        if (count == 0.0) {
            throw new ArithmeticException("분모가 0입니다.");
        }
        result = sum / count;
        return result;
    }
}
