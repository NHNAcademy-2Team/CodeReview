package unit.eight;

import java.util.Arrays;

public class Exercise9 {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 5);

        matrix.save("taehee.txt");

//        System.out.println(Arrays.toString(Matrix.read("taehee.txt").getMatrix()[0]));

        for (int[] result : Matrix.read("taehee.txt").getMatrix()) {
            System.out.println(Arrays.toString(result));
        }

    }


}
