import java.util.Scanner;
/*
 * Exercise 02.4
 * Exercise 02.5
 */

public class Exercise00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = "";
        while (sentence.length() >= 0 && sentence.length() <= 1) {
            try {
                sentence = scanner.nextLine();

                if (sentence.length() == 1) {
                    throw new Exception();
                }
                System.out.println(reverseLine(sentence));
                break;

            } catch (IndexOutOfBoundsException e) {
                System.out.println("입력된 값이 없습니다.");
            } catch (Exception e) {
                System.out.println("두글자 이상 입력해주세요.");
            }
        }
        scanner.close();
    }

    public static String reverseLine(String sentence) {
        StringBuffer sb = new StringBuffer(sentence);

        String first = sentence.substring(0, 1);
        sb.replace(0, 1, sentence.substring(sentence.length() - 1));
        sb.replace(sentence.length() - 1, sentence.length(), first);

        return sb.toString();
    }
}
