package CodeReview.Select1.src.main.java.unit.six;

public class Exercise8 {

    static final int NMAX = 10;

    public static void main(String[] args) {

        int row, column;

        for (row = 1; row <= NMAX; row++) {
            for(column = 1; column <= NMAX; column++) {
                if(row * column < 10) {
                    System.out.print("  ");
                } else if (row * column < 100) {
                    System.out.print(" ");
                }
                System.out.print(row * column + " ");
            }
            System.out.println();
        }
    }
}
