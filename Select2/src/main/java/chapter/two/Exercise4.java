package chapter.two;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Quarter (25 센트)
 * Dime (10 센트)
 * Nickel (5 센트)
 * Penny (1 센트)
 * 
 * 1 달러 = 100 센트
 */

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(DollarConvertor.centToDollar(scanner) + "달러");

        scanner.close();
    }
}

class DollarConvertor {

    private static final int QUARTER = 25;
    private static final int DIME = 10;
    private static final int NICKEL = 5;

    public static double centToDollar(Scanner scanner) {
        int[] coin = new int[4];

        System.out.print("교환할 동전의 수를 입력하세요(Quarter Dime Kickel Penny) : ");
        for (int i = 0; i < 4; i++) {
            try {
                coin[i] = Integer.parseInt(scanner.next());

                if (coin[i] < 0) {
                    throw new IllegalArgumentException("양수의 값을 입력해주세요.");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
        return (quarterToCent(coin[0]) + dimeToCent(coin[1]) + nickelToCent(coin[2]) + coin[3]) / 100.0;
    }

    private static int quarterToCent(int quarter) {
        return quarter * QUARTER;
    }

    private static int dimeToCent(int dime) {
        return dime * DIME;
    }

    private static int nickelToCent(int nickel) {
        return nickel * NICKEL;
    }

}
