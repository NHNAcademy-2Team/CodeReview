package unit.ten;

public class Exercise4 {

    public static int gcd(int x, int y) {
        int r = x % y;
        if (y == 0) {
            return x;
        } else {
            return gcd(y, r);
        }
    }

    public static boolean prime(int x, int y) {

        if (x < 0 || y < 0) {
            throw new ArithmeticException("y는 양의 정수만 가능합니다.");
        }

        if (x == 1 || y == 1) {
            return true;
        } else if (x != 1 && y != 1 && x == y) {
            return false;
        } else if (x != 1 && y != 1 && x < y) {
            return prime(x, y - x);
        } else {
            return prime(x - y, y);
        }
    }

    public static int rest(int x, int y) {

        if (y < 0) {
            throw new ArithmeticException("y는 양의 정수만 가능합니다.");
        }

        if (x < 0) {
            return rest(x + y, y);
        } else if (x < y && x >= 0) {
            return x;
        } else {
            return rest(x - y, y);
        }
    }
}
