package eight;

public class Exercise9 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 3);
        matrix.setMatrix(1, 0, 1);

        matrix.save("/Users/taehee/과정1/unit/resources/eight/exercise9.txt");

        Matrix matrix2 = new Matrix(3, 3);
        matrix2.setMatrix(0, 0, 1);
        matrix2.setMatrix(0, 1, 1);
    }
}
