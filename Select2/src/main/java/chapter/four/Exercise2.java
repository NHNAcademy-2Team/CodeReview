package four;

public class Exercise2 {
    //16 진수 값을 입력 받고 10진수 값으로 나오게 하세요. 그리고 16진수로 읽을수 없는 값이 입력될 경우 err로 나오게 하세요.(16진수 입력값에 소문자를 대문자로 변환 하세요.)
    public static void main(String[] args) {
        String str = "34A7"; // Scanner(?)
        int value = 0;
        for (int i = 0; i < str.length(); i++) {
            // value += hexValue(str.charAt(i)) * Math.pow(16, str.length()-i);
            value = value * 16 + hexValue(str.charAt(i));
        }
        System.out.println(value);
    }

    private static int hexValue(char c) {
        switch (c) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case 'A': case 'a': return 10;
            case 'B': case 'b': return 11;
            case 'C': case 'c': return 12;
            case 'D': case 'd': return 13;
            case 'E': case 'e': return 14;
            case 'F': case 'f': return 15;
            default:
                return 0;
        }
    }
}
