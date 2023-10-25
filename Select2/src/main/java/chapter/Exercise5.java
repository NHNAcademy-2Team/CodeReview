package chapter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise5 {

    private static final int DOZEN = 12;
    private static final int GROSS = DOZEN * DOZEN;
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

            if (eggs == 0) {
                System.out.println("소지한 달걀은 0개 입니다.");
            } else if (eggs < 0) {
                throw new IllegalArgumentException("댤걀 개수가 음수일 수 없습니다.");
            } else {
                print(eggs);
            }

        } catch (InputMismatchException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void print(int eggs) {

        int gross = eggs / GROSS;
        int dozen = eggs % 144 / DOZEN;
        int rest = eggs % 144 % DOZEN;

        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + rest);

    }

}
