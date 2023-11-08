package unit.ten;

public class Fibonacci {
    private static int count = 0;

    public static int fibonacci(int n) {
        count++;
        if(n < 0) {
            return -1;
        }
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(12));  // 144
        System.out.println(getCount());
    }
}
