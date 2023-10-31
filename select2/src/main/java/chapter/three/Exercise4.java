package Select2.src.main.java.chapter.three;

import java.util.InputMismatchException;

public class Exercise4 {

    public static void main(String[] args) {
        String line;
        char ch;

        System.out.print("문장을 입력하시요: ");
        line = textio.Textio.getln();

        try {
            for (int i = 0; i < line.length(); i++) {
                ch = line.charAt(i);
                if(!Character.isLetter(ch))
                    throw new InputMismatchException("문자가 아닌 것을 입력하셨습니다.");
                System.out.println(ch);
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

    }
}
