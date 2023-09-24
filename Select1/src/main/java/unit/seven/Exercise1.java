package unit.seven;

public class Exercise1 {
    /**
     *
     * Exercise 07.1 Write a method static double scalarProduct(double[] A, double[] B) that calculates the scalar
     * product of two arrays A and B, assuming they have the same length. We recall that the scalar product of A and B
     * is obtained as the sum of the products A[i]*B[i], for all i, with 0 < = i < A.length.
     *
     * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
     * */

    static double scalarProduct(double[] a, double[] b){
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        double[] a = {1.2, 2.0, 3.4, 1.4};
        double[] b = {5.0, 4.5, 2.2, 1.0};

        System.out.println(scalarProduct(a, b));

    }
}
