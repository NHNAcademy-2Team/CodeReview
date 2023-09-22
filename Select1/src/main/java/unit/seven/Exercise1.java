package unit.seven;

import java.util.Arrays;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        //스칼라 곱 : 각 배열 간 곱하여 합산
        double[] a = new double[10];
        double[] b = new double[10];

        a = assign(a.length);
        b = assign(b.length);


        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
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
