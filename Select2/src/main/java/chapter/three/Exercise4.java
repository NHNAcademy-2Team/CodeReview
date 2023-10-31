package select2.src.main.java.chapter.three;

import java.util.InputMismatchException;

public class Exercise4 {
    public static void main(String[] args) {
        String line;
        char ch;

        System.out.print("문장을 입력하시요: ");
        line = Textio.getln();

        try {
            for (int i = 0; i < line.length(); i++) {
                ch = line.charAt(i);
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    System.out.println(ch);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("문자가 아닌 것을 입력하셨습니다.");
        }

    }
}
