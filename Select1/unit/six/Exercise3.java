package unit.six;

public class Exercise3 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        try {
            System.out.println(factorial(5));
        } catch (StackOverflowError e) {
            System.out.println("양수를 적어주세유잉");
        }
    }
}
