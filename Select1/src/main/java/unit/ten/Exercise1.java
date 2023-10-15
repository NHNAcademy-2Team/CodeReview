package unit.ten;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni10/node30.html
 * Exercise 10.1 Provide an iterative implementation of a method that computes the n-th Fibonacci number.
 */
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("양수를 입력해주세요.");
        }
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
