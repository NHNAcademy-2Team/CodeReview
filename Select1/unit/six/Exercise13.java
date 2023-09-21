package unit.six;

public class Exercise13 {
    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void isPrimePrint(int n){
        if(n <= 0)
            throw new IllegalArgumentException("1 이상의 숫자를 입력해주세요.");
        int count = 1;
        int start = 2;
        while(count <= n){
            if (isPrime(start)) {
                System.out.print(start + " ");
                count++;
            }
            start++;
        }
    }

    public static void main(String[] args) {
        isPrimePrint(10);
    }
}
