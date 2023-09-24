package unit.five;

import java.util.Scanner;

public class Exercise5 {
    public static void quadraticEquation(int a, int b, int c){
        double result;

        if (a <= 0)
            throw new IllegalArgumentException("x^2의 계수에는 0이하의 숫자가 들어갈 수 없습니다.");
        result = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        System.out.println("방정식의 해 : " + (((-b) + result)/(2*a)) +", "+ (((-b) - result)/(2*a)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a, b, c에 들어갈 수를 입력해주세요(ax^2 + bx + c) : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        quadraticEquation(a, b, c);

        scanner.close();
    }
}
