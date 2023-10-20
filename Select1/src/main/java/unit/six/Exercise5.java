package unit.six;

public class Exercise5 {
    public static double pi(int n) {
        double result = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += 4.0 / (1 + i * 2);
            } else {
                result -= 4.0 / (1 + i * 2);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("내가 계산한 파이값: " + pi(1));
        System.out.println("실제 파이값: " + Math.PI);
    }


}
