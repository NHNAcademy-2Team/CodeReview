package unit4;

public class Ex4_10 {
    public static char lastCharacter(String s) {
        char ch;
        ch = s.charAt(4);
        return ch;
    }

    public static void main(String[] args) {
        String s = "apple";
        System.out.println(lastCharacter(s));
    }
}
