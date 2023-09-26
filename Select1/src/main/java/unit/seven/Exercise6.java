package unit.seven;

import java.util.Arrays;

public class Exercise6 {
    /**
     *
     * Exercise 07.6 A duplicate in an array is a value that appears more than once as element of the array.
     * Write a method static int numberOfDuplicates(int[] A) that returns the number of distinct duplicates in the array A.
     * Write also a method static int numberOfDistinctValues(int[] A) that returns the number of distinct values in the array A.
     * */

    static int numberOfDuplicates(int[] a) {
        return a.length - numberOfDistinctValues(a);
    }

    public static int numberOfDistinctValues(int[] a){
        int count = 1;

        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] != a[i + 1])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 5, 5, 9, 7, 9};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println("중복 항목 수 : " + numberOfDuplicates(a) + " 고유 항목 수 : " + numberOfDistinctValues(a));
    }
}
