package unit.seven;

public class Exercise5 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        assign(a);
        assign(b);

        System.out.println(equalArrays(a, b));
    }

    private static int[] assign(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        return a;
    }

    public static boolean equalArrays(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                return true;
            }
        }
        return false;
    }
}
