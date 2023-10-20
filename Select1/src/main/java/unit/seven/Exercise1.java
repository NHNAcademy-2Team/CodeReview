package unit.seven;

public class Exercise1 {

    static double scalarProduct(double[] arrayA, double[] arrayB) {
        double sum = 0;
        for (int i = 0; i < arrayA.length; i++) {
            sum += arrayA[i] * arrayB[i];
        }
        return sum;
    }

}
