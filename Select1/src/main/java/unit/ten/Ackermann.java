package unit.ten;

public class Ackermann {
    public static int ackermann(int m, int n) {
        if (m < 0 || n < 0) {
            return -1;
        }

        if (m == 0)
            return n + 1;
        else if (n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(ackermann(3, 1));    // 13
        System.out.println(ackermann(3, 2));   // 29
        System.out.println(ackermann(3, 3));    // 61
        System.out.println(ackermann(3, 4));    // 125

    }
}
