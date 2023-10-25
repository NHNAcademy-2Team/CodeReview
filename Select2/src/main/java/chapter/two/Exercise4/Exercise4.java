package chapter.two.Exercise4;

import java.util.Scanner;

public class Exercise4 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Change user = new Change();
        user.inputInfor(s);
        System.out.printf(user.getDollor());

    }
}
