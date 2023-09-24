package CodeReview.Select1.src.main.java.unit.six;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number : ");
            numbers[i] = scan.nextInt();
        }

        System.out.println(min(numbers));

        scan.close();

    }

    public static int min(int[] numbers) {
//        int min = Integer.MAX_VALUE;
//        for (int num : numbers) {
//            if (num < min) {
//                min = num;
//            }
//        }
//        return min;
        Arrays.sort(numbers);
        return numbers[0];
    }
}
