package unit.seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Exercise 7.6
 * A duplicate in an array is a value that appears more than once as element of the array.
 * Write a method static int numberOfDuplicates(int[] A)
 * that returns the number of distinct duplicates in the array A.
 *
 * Write also a method static int numberOfDistinctValues(int[] A)
 * that returns the number of distinct values in the array A.
 */
public class Exercise6 {
    public static void main(String[] args) {
        int[] a = {2, 2, 3, 3, 4, 9, 11, 8, 11, 11};
        System.out.println(numberOfDuplicates(a));
        System.out.println(numberOfDistinctValues(a));
    }

    //중복 값 개수
    public static int numberOfDuplicates(int[] a) {
        return a.length - numberOfDistinctValues(a);
    }

    //중복되지 않는 값 개수
    public static int numberOfDistinctValues(int[] a) {
        Arrays.sort(a);
        int count = 1;

        for (int i = 0; i < a.length - 1; i++) {
                if (a[i] != a[i+1]) {
                    count++;
            }
        }

        return count;
    }
}
