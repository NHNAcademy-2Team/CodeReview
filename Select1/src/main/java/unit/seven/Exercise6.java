package unit.seven;

import java.util.Arrays;

/* Exercise 7.6
 * A duplicate in an array is a value that appears more than once as element of the array.
 * Write a method static int numberOfDuplicates(int[] A)
 * that returns the number of distinct duplicates in the array A.
 *
 * Write also a method static int numberOfDistinctValues(int[] A)
 * that returns the number of distinct values in the array A.
 */
public class Exercise6 {
    public static int numberOfDupliates(int[] A) {
        Arrays.sort(A);
        int duplicate = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                duplicate++;
            }
        }

        return duplicate;
    }

    public static int numberOfDistinctValues(int[] A) {
        return A.length - numberOfDupliates(A);
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 3, 3, 4, 5, 6};  // duplicates = 3 , distinct = 6
        System.out.println(numberOfDupliates(A));
        System.out.println(numberOfDistinctValues(A));
    }
}
