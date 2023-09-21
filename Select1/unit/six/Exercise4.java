package unit.six;

import java.util.Scanner;

public class Exercise4 {

    public static int[] arrays;

    public static void inputArrays(Scanner scanner) {
        int n = scanner.nextInt();
        arrays = new int[n];

        for (int i = 0; i < n; i++) {
            arrays[i] = scanner.nextInt();
        }
    }

    public static void sumNumber() {
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > 0)
                positive += arrays[i];
            else {
                negative += arrays[i];
            }
        }
        System.out.println("Positive : " + positive + " Negative : " + negative);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputArrays(scanner);
        sumNumber();

        scanner.close();
    }
}
