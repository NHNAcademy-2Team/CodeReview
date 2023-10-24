package chapter;

import java.util.Scanner;

public class Exercise5 {
    //달걀
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("달걀이 몇 개 있습니까? : ");
        int eggs = scan.nextInt();

        countEggs(eggs);

        scan.close();
    }

    public static void countEggs(int eggs) {

        try {

            int gross = eggs / (12 * 12);
            int dozen = eggs % 144 / 12;
            int rest = eggs % 144 % 12;

            if (eggs == 0) {
                System.out.println("소지한 달걀은 0개 입니다.");
            } else if (eggs < 0) {
                throw new ArithmeticException("댤걀 개수가 음수일 수 없습니다.");
            } else {
                print(gross, dozen, rest);
            }

        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException n) {
            throw new RuntimeException(n);
        }
    }

    public static void print(int gross, int dozen, int rest) {

        if (gross > 0) {
            System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + rest);
        } else if (dozen > 0) {
            System.out.println("Your number of eggs is " + dozen + " dozen, and " + rest);
        } else {
            System.out.println("Your number of eggs is " + rest);
        }

    }

}
