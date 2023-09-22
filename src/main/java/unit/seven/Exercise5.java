package main.java.unit.seven;


import java.util.Arrays;

public class Exercise5 {
    public static void equalArrays(int[] a, int[] b) {
        if (Arrays.equals(a, b)) {
            System.out.println("두 배열 일치");
        } else {
            System.out.println("두 배열 불일치");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};

        equalArrays(a, b);
    }
}
