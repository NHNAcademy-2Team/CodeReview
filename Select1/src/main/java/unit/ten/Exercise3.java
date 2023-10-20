package unit.ten;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(ackermann(2, 3));
    }

    public static int ackermann(int m, int n) {
        if (m < 0 || n < 0)
            throw new IllegalArgumentException("양수를 입력해주세요.");
        if (m == 0)
            return n + 1;
        if (n == 0)
            return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}
