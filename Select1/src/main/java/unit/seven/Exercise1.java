package unit.seven;

public class Exercise1 {

    public static double scalarProduct(double[] a, double[] b) {
        double answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        double[] a = {1,2,3,4,5};
        double[] b = {6,7,8,9,10};

        System.out.println("스칼라 곱의 합은 "+scalarProduct(a, b));
    }
}
