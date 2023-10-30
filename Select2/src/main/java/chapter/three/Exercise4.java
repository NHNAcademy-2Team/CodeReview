package chapter.three;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        String detail;
        Scanner sc = new Scanner(System.in);
        System.out.print("내용을 입력하세요 : ");
        detail = sc.nextLine();

        for (int i = 0 ; i < detail.length() ; i++) {
            char c = detail.charAt(i);
            if (c == ' ') {
                System.out.println("");
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                System.out.print(c);
            } else {
                System.out.println("");
                System.out.println("정상적인 입력값이 아닙니다.");
                break;
            }
        }
        sc.close();
    }
}