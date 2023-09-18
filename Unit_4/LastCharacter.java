// 04.10
public class LastCharacter {
    public static char lastCharacter(String s) {
        return s.charAt(s.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(lastCharacter("school"));
    }
}
