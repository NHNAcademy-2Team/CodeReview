package chapter.two;
import java.util.Scanner;
public class Exercise6 {
    // 성이 포함된 이름을 입력받고 성과 이름을 따로 분류하여 출력하세요.
    public static void main(String[] args) {
        String fillName;
        Scanner sc = new Scanner(System.in);

        int cheak = 0;
        while (true) {
            System.out.print("Please enter your first name and last name, separated by a space. : ");
            fillName = sc.nextLine();

            cheak = fillName.indexOf(' ');
            if (cheak >= 0) {
                break;
            }
            System.out.println("err : 다시 입력하세요.");
        }
        String firstName = fillName.substring(0, cheak);
        String lastName = fillName.substring(cheak +1);

        System.out.println("Your first name is " + firstName + ", which has " + firstName.length() + " characters");
        System.out.println("Your last name is " + lastName + ", which has " + lastName.length() + " characters");
        System.out.println("Your initials are " + firstName.substring(0, 1).toUpperCase() + lastName.substring(0, 1).toUpperCase());
        sc.close();
    }
}
