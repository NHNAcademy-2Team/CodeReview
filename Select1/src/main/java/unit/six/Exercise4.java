package unit.six;

import java.util.Scanner;

public class Exercise4 {
    public static void sum(int[] n) {
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] < 0) {
                negative += n[i];
            } else {
                positive += n[i];
            }
        }

        System.out.printf("positive sum: %d\n" +
                "negative sum: %d\n", positive, negative);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = 1;
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = s.nextInt();
        }
        sum(num);

        s.close();
    }
}
