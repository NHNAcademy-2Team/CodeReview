package chapter.three;
public class Exercise2 {
    public static void main(String[] args) {
        int num;
        int maxDivisors = 1;
        int numWithMax = 1;

        for (num = 2; num <= 10000; num++) {
            int divisor;
            int count = 0;

            for (divisor = 1; divisor <= num; divisor++ ) {
                if (num % divisor == 0)
                    count++;
            }
            if (count > maxDivisors) {
                maxDivisors = count;
                numWithMax = num;
            }
        }

        System.out.println(maxDivisors);
        System.out.println(numWithMax);
    }
}
