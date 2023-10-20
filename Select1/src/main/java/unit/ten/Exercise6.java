package unit.ten;

public class Exercise6 {

    public static int calc(String s, char c, int x) {
        int max = x;
        int count = 0;

        if (s.length() <= 1) {
            int y = (s.charAt(0) == c) ? 1 : 0;
            return (max > y) ? max : y;
        }

        if (s.charAt(0) == c) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != c)
                    break;
                count++;
            }
        }

        if (max < count) {
            max = count;
        }

        return calc(s.substring(1), c, max);

    }

    public static void main(String[] args) {
        System.out.println(calc("l", 'l', 0));
    }
}