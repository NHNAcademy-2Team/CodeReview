
package unit.ten;

public class Prime {
   public static boolean prime(int x, int y) {
        if(x < 1 || y < 1) {
            throw new IllegalArgumentException("0보다 큰 자연수를 입력해주세유");
        }
        if (x != 1 && y != 1) {
            if (x == y) return false;
            else if (x < y) return prime(x, y - x);
            else {
                return prime(x - y, y);
            }
        }
        return true;
    }

    public static void main(String[] args) {
       try {
            System.out.println(prime(-1, 2));
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(prime(1,2)); // true
        System.out.println(prime(2,2)); // false
        System.out.println(prime(4,5)); // true
    }
}
