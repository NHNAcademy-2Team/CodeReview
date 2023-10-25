package chapter.two;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int egg = scanner.nextInt();
        EggConvertor.printEgg(egg);

        scanner.close();
    }
}

class EggConvertor {

    private static final int DOZEN = 12;
    private static final int GROSS = 144;
    private static int[] eggConvertor(int number) {
        int[] eggArrays = new int[3];
        eggArrays[0] = number / GROSS;
        number %= GROSS;
        eggArrays[1] = number / DOZEN;
        eggArrays[2] = number % DOZEN;

        return eggArrays;
    }

    public static void printEgg(int number) {
        int[] eggArrays = eggConvertor(number);

        System.out.println("gross : " + eggArrays[0] + "\ndozen : " + eggArrays[1] + "\nmodulus : " + eggArrays[2]);
    }
}
