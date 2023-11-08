package chapter.four;

public class Exercise2 {
    private static int hexValue(char digits) {
        String hex = "0123456789ABCDEFG";

        int hexNumber = hex.indexOf(String.valueOf(Character.toUpperCase(digits)));

        if (hexNumber == -1) {
            throw new IllegalArgumentException("16진수가 아닙니다.");
        }

        return hexNumber;
    }

    public static void main(String[] args) {
        int value = 0;
        String str = "0123456789ABCDEFG";

        for (int i = 0; i < str.length(); i++) {
            value = value * 16 + hexValue(str.charAt(i));
        }

        System.out.println(value);
    }
}
