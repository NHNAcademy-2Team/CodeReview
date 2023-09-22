package unit.six;


public class Exercise8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + "X" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
