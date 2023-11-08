package unit.ten;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni10/node30.html
 * Exercise 10.2 Modify the recursive implementation of the fibonacci method in such a way that, when it is called on the integer n, it computes besides the n-th Fibonacci number, also the total number of recursive activations of fibonacci used for the computation.
 */
public class Exercise2 {
    private static int count = 0;

    public static void main(String[] args) {
        int[] fibo1 = recursiveCountFibonacci(6);
        System.out.println(fibo1[0]);
        System.out.println(fibo1[1]);

        int[] fibo2 = recursiveCountFibonacci(6);
        System.out.println(fibo2[0]);
        System.out.println(fibo2[1]);
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("양수를 입력해주세요.");
        }
        count++;
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int[] recursiveCountFibonacci(int n) {
        count = 0;
        int result = fibonacci(n);
        return new int[] {count, result};
    }
}
