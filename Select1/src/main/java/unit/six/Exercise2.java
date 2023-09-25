package unit.six;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();

        System.out.println(Arrays.toString(even(num)));

        scan.close();
    }

    public static int[] even(int num) {
        int[] even = new int[num];
        if (num > 0) {
            for (int i = 1, j = 0; j < num; i++) {
                if (i % 2 == 0) {
                    even[j] = i;
                    j++;
                }
            }
        }
        return even;
    }
}


