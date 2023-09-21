package six;

public class Exercise8 {

    static final int NMAX = 10;

    public static void print(int row, int column) {
        if (row * column < 10)
            System.out.print(row * column + "  ");
        else {
            System.out.print(row * column + " ");
        }
    }

    public static void main(String[] args) {
        int row, column;

        for (row = 1; row <= NMAX; row++) {
            for (column = 1; column <= NMAX; column++) {
                print(row, column);
            }
            System.out.println();
        }
    }
}
