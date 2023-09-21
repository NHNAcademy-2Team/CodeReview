package unit.six;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter the number : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        System.out.println(min(numbers));

        scan.close();

    }

    public static int min(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
