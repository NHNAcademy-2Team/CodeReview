package chapter.three;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        double firstNum;
        double secondNum;
        char calc;
        double value;

        Scanner sc = new Scanner(System.in);
        System.out.print("수를 입력하세요. : ");
        firstNum = sc.nextDouble();
        System.out.print("기호를 입력하세요. : ");
        calc = sc.next().charAt(0);
        System.out.print("수를 입력하세요. : ");
        secondNum = sc.nextDouble();

        value = calculate(firstNum, secondNum, calc);

        System.out.printf("답은 : %.2f 입니다.", value);
        sc.close();
    }

    public static double calculate(double a, double b, char calc) {
        double value;

        if (calc == '+') {
            value = a + b;
        } else if (calc == '-') {
            value = a - b;
        } else if (calc == '*') {
            value = a * b;
        } else if (calc == '/') {
            value = a / b;
        } else {
            System.out.println("적당한 기호를 입력하세요.");
            value = 0;
        }

        return value;
    }
}
