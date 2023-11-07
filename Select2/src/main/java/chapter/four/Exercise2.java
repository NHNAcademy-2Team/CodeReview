package chapter.four;

public class Exercise2 {
    public static int hexValue(char ch) {
        ch = Character.toLowerCase(ch);
        switch (ch) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                return (int) (ch - 'a' + 10);
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return (int) (ch - '0');
            default:
                return -1;
        }
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
