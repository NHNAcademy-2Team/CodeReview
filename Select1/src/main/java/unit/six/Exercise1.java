package unit.six;

public class Exercise1 {
    public static void smallest(int[] a) {
        int smallest = a[0];
        for (int i = 1; i < 10; i++) {
            if (smallest > a[i]) {
                smallest = a[i];
            }
        }

        System.out.printf("smallest one is %d\n", smallest);
    }

    public static void main(String[] args) {
        int[] a = {10, 2, 3, 4, 6, 23, 43, 64, 90, 23};

        smallest(a);
    }
}
