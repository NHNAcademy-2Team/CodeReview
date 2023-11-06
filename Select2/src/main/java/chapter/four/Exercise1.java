package select2.src.main.java.chapter.four;

import java.util.Scanner;

public class Exercise1 {
    public static void printCapitalized(String string){
        char ch;
        char frontCh = '.';
        for (int i = 0; i < string.length() ; i++) {
            ch = string.charAt(i);
            if(Character.isLetter(ch) && !Character.isLetter(frontCh))
                System.out.print(Character.toUpperCase(ch));
            else
                System.out.print(ch);
            frontCh = ch;
        }
    }

    public static void main(String[] args) {
        String line;
        Scanner scn = new Scanner(System.in);
        System.out.println("문장을 입력하세요.");
        line = scn.nextLine();
        System.out.print("바뀐 문장: ");
        printCapitalized(line);

    }
}
