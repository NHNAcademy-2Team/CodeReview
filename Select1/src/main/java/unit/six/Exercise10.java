package unit.six;

public class Exercise10 {
    public static int factorial(int n){
        if(n == 1)
            return 1;
        int product = 1;
        for(int i = n; i > 0; i--){
            product *= i;
        }
        return product;
    }
    public static void factorialAll(int n){
        if(n <= 0)
            throw new IllegalArgumentException("1 이상의 숫자를 입력해주세요.");
        for(int i = 1; i <= n; i++){
            System.out.println(factorial(i));
        }
    }
    public static void main(String[] args) {
        factorialAll(5);
    }
}
