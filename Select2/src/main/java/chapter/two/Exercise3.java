package chapter.two;
import java.util.Scanner;

public class Exercise3 {
    // 이름을 입력 받고 그 이름을 대분자로 출력하세요.("Hello, ???, nice to meet you!")
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요 : ");
        name = sc.nextLine().toUpperCase();

        System.out.println("Hello, " + name +", nice to meet you!");
        sc.close();
    }
}
