package unit.seven;

import java.util.Arrays;

public class Exercise7 {
    /**
     *
     * Exercise 07.7 Write a method static int[] removeDuplicates(int[] A) that returns a new array obtained
     * from A by removing all duplicates. The duplicates should be removed by keeping only the first occurrence
     * of each distinct element, and shifting remaining elements upwards when a duplicate is removed.
     * */

    static int[] RemoveDuplicates(int[] a){
        int size = Exercise6.numberOfDistinctValues(a);
        int[] arrays = new int[size];

        arrays[0] = a[0];
        for (int i = 0, j = 1; i < a.length - 1; i++) {
            if(a[i] != a[i + 1]) {
                arrays[j] = a[i + 1];
                j++;
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 5, 5, 9, 7, 9};
        Arrays.sort(a);

        System.out.println(Arrays.toString(RemoveDuplicates(a)));
    }
}
