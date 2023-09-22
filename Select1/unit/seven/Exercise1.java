package unit.seven;

public class Exercise1 {
    public static double scalarProduct(double[] A, double[] B){
        double sum = 0;
        for(int i = 0; i < A.length; i++){
            sum += A[i] * B[i];
        }
        return sum;
    }
    public static void scalarProductTest(){
        double[] A = {1.0, 2.2, 4, 2.5};
        double[] B = {3, 1.2, 3, 2};
        System.out.println(scalarProduct(A, B));
    }
    public static void main(String[] args) {
        scalarProductTest();
    }
}
