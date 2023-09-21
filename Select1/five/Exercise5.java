package five;

import java.util.Scanner;

public class Exercise5 {
    public static double quadraticEquation(int a, int b, int c) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(quadraticEquation(a, b, c));

        scanner.close();
    }
}
