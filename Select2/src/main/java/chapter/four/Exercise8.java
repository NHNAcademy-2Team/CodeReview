package four;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        final int problemQuantity = 10; // 문제 수량

        int[] firstNums = new int[problemQuantity];
        int[] secondNums = new int[problemQuantity];
        int[] answerNums = new int[problemQuantity];
        int answerCount = 0;


        for (int i = 0 ; i < problemQuantity ; i++) {
            firstNums[i] = (int)(Math.random() * 100);
            secondNums[i] = (int)(Math.random() * 100);
            answerNums[i] = firstNums[i] + secondNums[i];
            System.out.println("문제를 해결하세요[" + (i+1) + "]. (" + firstNums[i] + " + " + secondNums[i] + ") = ");
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < problemQuantity ; i++) {
            System.out.print("답을 작성하세요[" + (i+1) + "]. (" + firstNums[i] + " + " + secondNums[i] + ") = ");
            int answer = sc.nextInt();
            if (answer == answerNums[i]) {
                System.out.println("정답!");
                answerCount++;
            } else {
                System.out.println("틀렸습니다. 정답은 " + answerNums[i] + "입니다.");
            }
        }

        System.out.println("총 " + answerCount + "개를 맞추셨습니다.");

    }

}
