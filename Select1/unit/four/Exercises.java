package Select1.Unit04;

import java.util.Scanner;

public class Exercises {
    // Ex 4_1
    public static double convertLiraEuro(int x) {
        return x * 0.035;
    }

    // Ex 4_2
    public static boolean sumOverflow(byte x, byte y) {

        int sum = x + y;
        if (sum >= -128 && sum <= 127) {
            return true;
        }
        return false;
    }

    // Ex4_3
    public static int arithmeticMean(int sum) {
        return sum / 2;
    }

    public static double geometricMean(int sum) {
        return Math.sqrt(sum);
    }

    // Ex4_4
    public static boolean even(long x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Ex4_10
    public static char lastCharacter(String s) {
        char ch;
        ch = s.charAt(4);
        return ch;
    }

    public static void main(String[] args) {
        // Ex 4_1
        int lira = 0;
        Scanner scn = new Scanner(System.in);
        lira = scn.nextInt();

        System.out.println();
        System.out.print(lira + " 리라는 ");
        System.out.printf("%.2f", convertLiraEuro(lira));
        System.out.println(" 유로입니다.");

        // Ex 4_2
        Byte check1 = 127;
        Byte check2 = 127;

        System.out.println(sumOverflow(check1, check2));

        // Ex 4_3
        int x = scn.nextInt();
        int y = scn.nextInt();
        int sum = x + y;

        System.out.println("산술 평균은 " + arithmeticMean(sum));
        System.out.print("기하 평균은 ");
        System.out.printf("%.3f", geometricMean(sum));
        System.out.println();
        if (arithmeticMean(sum) > geometricMean(sum)) {
            System.out.println("산술 평균이 더 큽니다.");
        } else {
            System.out.println("기하 평균이 더 큽니다,");
        }
        // Ex 4_4
        long a = scn.nextLong();

        System.out.println(even(a));

        // Ex 4_5
        short i = 22;
        byte j = (byte) i;
        System.out.println(j);

        // Exx4_10
        String s = "apple";
        System.out.println(lastCharacter(s));

        scn.close();

    }
}
