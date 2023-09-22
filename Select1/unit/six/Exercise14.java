package unit.six;

public class Exercise14 {
    public static void primeFactors(int n){
        if(n <= 0)
            throw new IllegalArgumentException("양수를 입력하세요.");
        if(n == 1)
            throw new IllegalArgumentException("소인수가 없습니다.");
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n != 1) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        primeFactors(220);
    }
}
