package chapter.two;

import java.util.Scanner;

public class Exercise1 {
    // 9줄 높이의 글자를 표준출력으로 이셜를 인쇄 하세요.
    public static void main(String[] args) {
        System.out.println(" **    **   **    **      ***    ");
        System.out.println(" **    **   **   **     **   **  ");
        System.out.println(" **    **   **  **     **     ** ");
        System.out.println(" **    **   ** **       **       ");
        System.out.println(" ********   ****          ***    ");
        System.out.println(" **    **   ** **            **  ");
        System.out.println(" **    **   **  **     **     ** ");
        System.out.println(" **    **   **   **     **   **  ");
        System.out.println(" **    **   **    **      ***    ");
        // custom
        System.out.println("");
        System.out.println("");
        System.out.print("기호 하나를 입력하시오 : ");
        Scanner sc = new Scanner(System.in);
        char c = ' '; // <<<--- 원하는 기호 입력
        c = sc.nextLine().charAt(0);
        System.out.println(" " + c + c + "    " + c + c + "   " + c + c + "    " + c + c + "      " + c + c + c + "    ");
        System.out.println(" " + c + c + "    " + c + c + "   " + c + c + "   " + c + c + "     " + c + c + "   " + c + c + "  ");
        System.out.println(" " + c + c + "    " + c + c + "   " + c + c + "  " + c + c + "     " + c + c + "     " + c + c + " ");
        System.out.println(" " + c + c + "    " + c + c + "   " + c + c + " " + c + c + "       " + c + c + "        ");
        System.out.println(" " + c + c + c + c + c + c + c + c + "   " + c + c + c + c + "          " + c + c + c +"     ");
        System.out.println(" " + c + c + "    " + c + c + "   " + c + c + " " + c + c + "            " + c + c + "   ");
        System.out.println(" " + c + c + "    " + c + c + "   " + c + c + "  " + c + c + "     " + c + c + "     " + c + c + " ");
        System.out.println(" " + c + c + "    " + c + c + "   " + c + c + "   " + c + c + "     " + c + c + "   " + c + c + "  ");
        System.out.println(" " + c + c + "    " + c + c + "   " + c + c + "    " + c + c + "      " + c + c + c + "    ");
        sc.close();
    }
}