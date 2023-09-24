package unit.seven;

public class Exercise5 {
    /**
     *
     * Exercise 07.5 Write a predicate static boolean equalArrays(int[] A, int[] B) that returns true if the two arrays
     * A and B are equal (i.e., A[i] is equal to B[i], for each i), and false otherwise.
     * */

    static boolean equalArrays(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {1, 3, 5, 7};

        System.out.println(equalArrays(a, b));
    }
}
