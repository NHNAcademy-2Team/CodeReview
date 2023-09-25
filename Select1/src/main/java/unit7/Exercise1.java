package src.main.java.unit7;

public class Exercise1 {

    static double scalarProduct(double[] A, double[] B) {
        double sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[i];
        }
        return sum;
    }

}
