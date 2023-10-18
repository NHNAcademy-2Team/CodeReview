package unit.ten;

public class Exercise2 {

    //정수 n에 호출될 때 n번째 피보나치 수 뿐 아니라 계산에 사용된 총 재귀 호출 수도 계산
    //보류
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
