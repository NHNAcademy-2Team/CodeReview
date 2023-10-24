package chapter.eight;

import java.util.Scanner;

public class Exercise2 {
    public static double calculateAverage(){
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true){
            int input = scn.nextInt();
            if(input == 0){
                break;
            }
            sum += input;
            count++;
        }
        scn.close();

        if(count == 0){
            return 0.0;
        } else {
            return (double) sum / count;
        }
    }

    public static void main(String[] args) {
        System.out.println("양의 정수를 입력하세요. 0을 입력하면 종료됩니다.");
        double average = calculateAverage();
        System.out.println("입력한 값의 평균은 " + average);
    }
}
