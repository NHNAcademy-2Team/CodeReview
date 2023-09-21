package unit.five;

public class Exercise5 {
    public static void quadraticEquation(int a, int b, int c) {
        // 복소수 구하는 거 구현해야함
        System.out.println("근1: " + Math.sqrt(b * b - 4 * a * c));
        System.out.println("근2: " + Math.sqrt(b * b + 4 * a * c));

    }

    public static void main(String[] args) {
        quadraticEquation(1, 4, 2);
    }
}
