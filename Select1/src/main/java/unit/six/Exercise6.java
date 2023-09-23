package unit.six;

public class Exercise6 {
    public static String decode(String str, int d){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int num = (int) c - d;
            c = (char) num;
            result += String.valueOf(c);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(decode("hello", 3));
    }
}
