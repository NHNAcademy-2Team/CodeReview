package unit.six;

public class Exercise6 {
    public static String decode(String str, int d) {
        String text = "";
        for (int i = 0; i < str.length(); i++) {
            text += (char) (str.charAt(i) - d);
        }
        return text;
    }

    public static void main(String[] args) {
        System.out.println(decode("khoor", 3)); // hello의 각 char에 3씩 뺀 문자열
        
    }
}
