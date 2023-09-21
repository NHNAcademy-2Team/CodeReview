package unit.six;

public class Exercise2 {
    public static void printEven(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * 2 + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printEven(5);
    }
}
