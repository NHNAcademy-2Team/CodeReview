package unit.seven;

import java.util.Arrays;

/* Exercise 7.7
 * Write a method static int[] removeDuplicates(int[] A)
 * that returns a new array obtained from A by removing all duplicates.
 *
 * The duplicates should be removed by keeping only the first occurrence of each distinct element,
 * and shifting remaining elements upwards when a duplicate is removed.
 */
public class Exercise7 {

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

    public static int[] removeDuplicates(int[] A) {
        Arrays.sort(A);
        int[] result = new int[numberOfDistinctValues(A)];
        for (int i = 0, j = 0; i < A.length - 1; i++) {
            if (A[i] != A[i + 1]) {
                result[j++] = A[i];
                if (i == A.length - 2) {
                    result[j] = A[i + 1];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 3, 3, 4, 5, 6};
        int[] result = removeDuplicates(A);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
