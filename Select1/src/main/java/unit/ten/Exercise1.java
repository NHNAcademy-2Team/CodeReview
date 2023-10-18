package unit.ten;

public class Exercise1 {

    //n번째 피보나치 수를 계산하는 메서드 구현

    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

}
