package chapter.two;

import java.util.Scanner;

public class Exercise4 {

    //사용자가 자신의 잔돈 세는 프로그램
    //1 penny = 1 cent
    //1 nickel = 5 cent
    //1 dime = 10 cent
    //1 quarter = 25 cent
    //1 dollar = 100 cent
    //여러 돈을 달러 단위로 계산

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("사용자의 잔돈을 계산합니다.");

        Change change = new Change();
        change.question(scan);

        System.out.print(change.getChange());
        scan.close();
    }


}


class Change {

    private int penny;
    private int nickle;
    private int dime;
    private int quarter;
    private double dollar;
    int[] answer = new int[4];

    public Change() {
        this.quarter = 25;
        this.dime = 10;
        this.nickle = 5;
        this.penny = 1;
        this.dollar = 0.0;
    }

    public void question(Scanner scan) {

        String[] question = {"쿼터(quarter)", "다임(dime)", "니클(nickle)", "페니(penny)"};

            for (int i = 0; i < answer.length; i++) {
                System.out.print(question[i] + " 몇 개입니까? : ");
                answer[i] = scan.nextInt();

                if (answer[i] < 0) {
                    i--;
                    System.out.println("0 이상의 양수를 입력하십시오.");
                }

                if (i < 0) {
                    throw new MinusException();
                }

            }
    }

    public String getChange() {
        String result = "";
        this.dollar = (this.quarter * answer[0] + this.dime * answer[1] +
                        this.nickle * answer[2] + this.penny * answer[3]) / 100.0;

        if (this.dollar == 0.0) {
            result = "가진 돈이 없습니다.";
        }
        return "현재 소지금은 " + this.dollar + "달러 입니다.";
    }
}
