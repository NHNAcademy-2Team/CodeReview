package chapter.four;

public class Exercise1 {
    public static void printCapitalized(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        char frontCh = ' ';
        for (char ch : charArray) {
            if (!Character.isLetter(frontCh) && Character.isLetter(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }
            frontCh = ch;
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str = "Now is the time ;to act!";
        printCapitalized(str);
    }
}
