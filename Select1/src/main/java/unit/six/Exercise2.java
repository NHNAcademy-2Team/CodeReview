package unit.six;

import java.util.Scanner;

public class Exercise2 {

    public static void evenNumbers(int n) {
        int number = 2;
        while (n > 0) {
            System.out.printf("%d ", number);
            number += 2;
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        evenNumbers(n);

        scanner.close();
    }
}