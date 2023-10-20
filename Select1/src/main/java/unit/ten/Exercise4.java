package unit.ten;

public class Exercise4 {

    public static int gcd(int x, int y) {
        if (y == 0)
            return x;

        return gcd(y, x % y);
    }

    public static boolean prime(int x, int y) {
        if (x == 1 || y == 1) {
            return true;
        } else {
            if (gcd(x, y) == 1)
                return true;
            return false;
        }
    }

    public static int rest(int x, int y) {
        if (x < y)
            return x;

        return rest(x - y, y);
    }

    public static void main(String[] args) {
        System.out.println(gcd(648, 232));
        System.out.println(prime(2, 4));
        System.out.println(rest(139, 13));
    }
}
