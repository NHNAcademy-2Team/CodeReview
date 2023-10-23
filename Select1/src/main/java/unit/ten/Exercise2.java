package unit.ten;

import java.io.IOException;

public class Exercise2 {
    static int count = 0;
    public static int fibonacci(int n) {
        count++;
        try {
            if( n < 0)
                return n;
        } catch (IllegalArgumentException e) {
            System.out.println("음수입니다.");
        }
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


    public static void main(String[] args) {
        int n = 6;

        int fib = fibonacci(n);
        System.out.println("Fibonacci(" + n + "): " + fib);
        System.out.println("총 재귀 횟수: " + count);
    }
}
