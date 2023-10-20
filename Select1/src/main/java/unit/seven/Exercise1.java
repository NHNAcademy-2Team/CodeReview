package unit.seven;

import java.util.Arrays;
import java.util.Random;
/**
 * Link : https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
 * Exercise 07.1
 * Write a method static double scalarProduct(double[] A, double[] B) that calculates the scalar product of two arrays A and B, assuming they have the same length.
 * We recall that the scalar product of A and B is obtained as the sum of the products A[i]*B[i], for all i, with 0 < = i < A.length.
 */
public class Exercise1 {
    public static void main(String[] args) {
        //스칼라 곱 : 각 배열 간 곱하여 합산
        double[] a = new double[10];
        double[] b = new double[10];

        a = assign(a.length);
        b = assign(b.length);

        System.out.println(scalarProduct(a, b));
    }

    private static double[] assign(int n) {
        double result[] = new double[n];
        Random rnd = new Random();
        for(int i=0; i<n; i++) {
            result[i] = Math.floor(rnd.nextDouble() * 100.0) / 10;
        }
        return result;
    }

    public static double scalarProduct(double[] a, double[] b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }
}
