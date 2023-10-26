package unit.ten;

public class Rest {
    public static int rest(int x, int y) {
        if (y <= 0) {
            throw new IllegalArgumentException("y는 자연수입니다.");
        }
        if(x < 0) {
            return rest(x + y, y);
        }
        else if (0 <= x && x < y) {
            return x;
        }
        else {
            return rest(x - y, y);
        }
    }

    public static void main(String[] args) {
        System.out.println(rest(-10, 7)); // 4
        System.out.println(rest(10, 2)); // 0
        System.out.println(rest(3, 10)); // 3
        try {
            System.out.println(rest(2, -1));
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
