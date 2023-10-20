package unit.seven;

public class Exercise8 {

    public static int mystery(int[] Array) {
        int x = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 1) x++;
        }
        return x;
    }
}
