package chapter;

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

    private static int[] eggConvertor(int number) {
        int[] eggArrays = new int[3];
        eggArrays[0] = number / 144;
        number %= 144;
        eggArrays[1] = number / 12;
        eggArrays[2] = number % 12;

        return eggArrays;
    }

    public static void printEgg(int number) {
        int[] eggArrays = eggConvertor(number);

        System.out.println("gross : " + eggArrays[0] + "\ndozen : " + eggArrays[1] + "\nmodulus : " + eggArrays[2]);
    }
}
