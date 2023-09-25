package unit.six;

import java.util.Scanner;

public class Exercise5 {
    //보류
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("항의 개수를 입력하시오 : ");
        int n = scan.nextInt();

        System.out.println(pi(n));

        scan.close();
    }

    public static double pi(int n) {
        double operator = 1.0;
        double result = 0.0;
        for (int i = 0, j = 1; i < n; i++, j += 2) {
            result += (operator * 4 / j);
            operator *= -1;
        }

        return result;
    }
}
