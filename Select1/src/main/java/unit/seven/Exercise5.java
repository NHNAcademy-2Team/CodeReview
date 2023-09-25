package unit.seven;

/*
 * Exercise 7.5
 * Write a predicate static boolean equalArrays(int[] A, int[] B)
 * that returns true if the two arrays A and B are equal (i.e., A[i] is equal to B[i], for each i),
 * and false otherwise.
 */
public class Exercise5 {
    public static boolean equalArrays(int[] A, int[] B) {
        if (A.length != B.length) {
            return false;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 4};
        int[] B = {1, 2, 2, 3, 4, 4};

        System.out.println(equalArrays(A, B));


        int[] C = {1, 2, 3, 4, 5};
        int[] D = {1, 2, 3, 4, 5};
        System.out.println(equalArrays(C, D));
    }
}
