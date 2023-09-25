package src.main.java.unit.seven;

public class Exercise8 {

    public static int mystery(int[] A) {
        int x = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) x++;
        }
        return x;
    }
}
