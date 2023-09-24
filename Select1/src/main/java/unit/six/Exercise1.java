package unit.six;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

    public static int[] inputNumber(Scanner scanner) {
        int[] arrays = new int[10];
        for (int i = 0; i < 10; i++) {
            arrays[i] = scanner.nextInt();
        }
        return arrays;
    }

    public static int smallNumber(int[] arrays) {
        Arrays.sort(arrays);
        return arrays[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = inputNumber(scanner);
        System.out.println(smallNumber(arrays));

        scanner.close();
    }
}
