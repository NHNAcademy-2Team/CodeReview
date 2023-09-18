package unit4;

public class Ex4_2 {
    public static boolean sumOverflow(byte x, byte y) {

        int sum = x + y;
        if (sum >= -128 && sum <= 127)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Byte check1 = 127;
        Byte check2 = 127;

        System.out.println(sumOverflow(check1, check2));
    }
}
