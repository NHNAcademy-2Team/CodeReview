package chapter.ten;

public class Exercise1 {
    public static int fibonacci(int n) {
        int result = 0;
        if (n == 0 || n == 1)
            return n;
        else if (n > 1) {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci(" + n + "): " + fibonacci(n));
    }

}
