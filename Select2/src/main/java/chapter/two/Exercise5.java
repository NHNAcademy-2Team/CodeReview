package chapter.two;
import java.util.Scanner;

public class Exercise5 {
    // 총 n개의 달걀을 12개씩 묶어 1판을 만들고 나머지 달걀개수를 구하세요. 더 나아가 12판을 묶은 1상자를 만들고 총 ?상자 ?판 ?개의 달걀이 남는지 출력하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("달걀의 개수를 입력하세요. : ");
        int eggs = sc.nextInt();
        int eggBoxs = eggs/144;
        eggs %= 144;
        int eggCartons = eggs/12;
        eggs %= 12;

        System.out.println("Your number of eggs is " + eggBoxs + " gross, " + eggCartons + "dozen, and " + eggs);
        sc.close();
    }
}
