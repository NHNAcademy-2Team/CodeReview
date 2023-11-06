package chapter.four;

public class Exercise1 {
    public static void printCapitalized(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.print(String.valueOf(words[i].charAt(0)).toUpperCase()
                    + words[i].substring(1) + " ");
        }
    }

    public static void main(String[] args) {
        String str = "Now is the time to act!";
        printCapitalized(str);
    }
}
