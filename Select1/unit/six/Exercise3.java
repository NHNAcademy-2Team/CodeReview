package unit.six;

import java.util.Scanner;

public class Exercise3 {

    public static void checkNumber(Scanner scanner) {
        int number = 0;
        while (number <= 0) {
            try {
                number = scanner.nextInt();
                if (number < 0)
                    throw new Exception();
                else {
                    System.out.println(factorial(number));
                    break;
                }
            } catch (Exception e) {
                System.out.println("양수를 입력해주세요.");
            }
        }
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        checkNumber(scanner);

        scanner.close();
    }
}
