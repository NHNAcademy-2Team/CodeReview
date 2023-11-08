package unit.ten;

public class Gcd {
    public static int gcd(int x, int y) {
        if(y == 0) return x;
        else if(y > 0) {
            return gcd(y, x%y);
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(gcd(12,24)); // 12
        System.out.println(gcd(30, 8)); // 2
    }
}
