package unit.six;

public class Exercise8 {
    static final int NMAX = 10;

    public static void main(String[] args) {
        int row, column;

        for (row = 1; row <= NMAX; row++) {
            for (column = 1; column <= NMAX; column++) {
                System.out.print(row * column + "\t");
            }
            System.out.println();
        }

    }
}
