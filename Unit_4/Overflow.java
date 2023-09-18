// 04.2
public class Overflow {
    public static boolean sumOverflow(byte x, byte y) {
        short a = x;
        short b = y;
        int sum = a + b;

        if (sum >= -128 && sum <= 127) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println("Overflow를 유발하는 값? : " + sumOverflow((byte) 1, (byte) 2));
    }
}
