package unit.seven;

/**
 * Link : https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
 * Exercise 07.1
 * Write a method static double scalarProduct(double[] A, double[] B) that calculates the scalar product of two arrays A and B, assuming they have the same length.
 * We recall that the scalar product of A and B is obtained as the sum of the products A[i]*B[i], for all i, with 0 < = i < A.length.
 */
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
