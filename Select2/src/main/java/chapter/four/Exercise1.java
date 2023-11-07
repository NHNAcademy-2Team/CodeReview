package four;

public class Exercise1 {
    // printCapitalized 라는 서브루틴을 만드세요 기능은 문자열을 매개변수로 받고 그 문자열의 첫번째 글자를 대문자라 변환하세요.
    public static void main(String[] args) {
        String str = "hello my name is hong kyoung seuk.me go";
        printCapitalized(str);
    }

    static void printCapitalized(String str) {  // Character.isLetter(char), Character.toUpperCase(char)
        char frontChar = ' ';
        for (int i = 0 ; i < str.length() ; i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (frontChar == ' ') {
                    System.out.print(Character.toUpperCase(str.charAt(i)));
                } else {
                    System.out.print(str.charAt(i));
                }
                frontChar = '.';
            } else {
                System.out.print(str.charAt(i));
                frontChar = str.charAt(i);
            }
        }
    }
}
