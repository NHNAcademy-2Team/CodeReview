package unit.six;

import java.util.Scanner;

public class Exercise9 {
    //보류
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1~9 중 숫자를 하나만 입력하십시오 : ");
        int h = scan.nextInt();

        pyramid(h);

    }

    public static void pyramid(int h) {

        for (int i=0; i<h; i++) {
            for(int j=h-i; j>=0; j--) {
                System.out.print(" ");
            }

            for(int j=0; j<=i; j++) {
                System.out.print(j);
            }

            for(int j=i-1; j>=0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
