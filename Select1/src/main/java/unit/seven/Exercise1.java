package unit.seven;

public class Exercise1 {
    public static double scalarProduct(double[] A, double[] B) {
        double result = 0;
        for (int i = 0; i < A.length; i++) {
            result = A[i] * B[i];
        }

        return result;
    }

    public static void main(String[] args) {
        double[] a = {1, 2, 3, 4, 5.4, 3.4, 2.1};
        double[] b = {2, 3, 41, 5.2, 3.1, 3.4, 3.2};

        System.out.printf("%.2f", scalarProduct(a, b));
    }
}
