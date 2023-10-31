package unit.seven;

/*
 * Exercise 7.5
 * Write a predicate static boolean equalArrays(int[] A, int[] B)
 * that returns true if the two arrays A and B are equal (i.e., A[i] is equal to B[i], for each i),
 * and false otherwise.
 */
public class Exercise5 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        assign(a);
        assign(b);

        System.out.println(equalArrays(a, b));
    }

    private static int[] assign(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        return a;
    }

    public static boolean equalArrays(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
