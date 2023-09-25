package unit.six;

public class Exercise11 {
    public static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(n + " Is prime: " + prime(n));
    }
}
