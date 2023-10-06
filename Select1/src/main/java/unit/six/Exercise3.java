package unit.six;

public class Exercise3 {
    public static int factorial(int n){
        if(n < 0)
            throw new IllegalArgumentException("음수입니다.");
        if(n == 0 || n == 1)
            return 1;
        int product = 1;
        for(int i = n; i > 0; i--){
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(5));
        System.out.println(factorial(-2));
    }
}
