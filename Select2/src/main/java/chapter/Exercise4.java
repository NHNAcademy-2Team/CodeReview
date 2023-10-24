package chapter;
import java.util.Scanner;

public class Exercise4 {
    // 가지고있는 쿼터(quarter), 다임(dime), 니켈(nickel), 페니(pennie) 수를 작성하고 달러(dollar)로 출력하시오.
    public static void main(String[] args) {
        int quarter;
        int dime;
        int nickel;
        int pennie;
        double dollar;

        Scanner sc = new Scanner(System.in);

        System.out.println("쿼터(quarter)에 개수를 입력하시요. : ");
        quarter = sc.nextInt();

        System.out.println("다임(dime)에 개수를 입력하시요. : ");
        dime = sc.nextInt();

        System.out.println("니켈(nickel)에 개수를 입력하시요. : ");
        nickel = sc.nextInt();

        System.out.println("페니(pennie)에 개수를 입력하시요. : ");
        pennie = sc.nextInt();

        dollar = (0.25 * quarter) + (0.1 * dime) + (0.05 * nickel) + (0.01 * pennie);

        System.out.println("");
        System.out.printf("가지고있는 달러(dollar)는 %.2f 달러 입니다.", dollar);
        sc.close();
    }
}
