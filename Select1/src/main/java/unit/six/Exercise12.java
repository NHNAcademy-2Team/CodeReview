package unit.six;

public class Exercise12 {
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void isPrimeAll(int n){
        if(n < 2)
            throw new IllegalArgumentException("2 이상 입력해주세요.");
        for(int i = 2; i <= n; i++){
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        isPrimeAll(23);
    }
}
