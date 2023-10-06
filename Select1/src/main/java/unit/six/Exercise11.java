package unit.six;

public class Exercise11 {
    public static boolean isPrime(int n){
        if(n < 0)
            throw new IllegalArgumentException("양의 정수를 입력하세요.");
        if(n == 1)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(24));
        System.out.println(isPrime(11));
    }
}
