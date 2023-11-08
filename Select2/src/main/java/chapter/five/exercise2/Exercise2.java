package chapter.five.exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
    public static void main(String[] args) {
        StatCalc calc = new StatCalc();
        readData(calc);
        printCalc(calc);
    }

    private static void readData(StatCalc calc){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String line;
            while(!(line = br.readLine()).equals("0")){
                calc.enter(Integer.parseInt(line));
                System.out.println(Integer.parseInt(line));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printCalc(StatCalc calc){
        System.out.printf("데이터세트에 추가된 항목 수 : %d\n", calc.getCount());
        System.out.printf("데이터세트 항목의 합계 : %.2f\n", calc.getSum());
        System.out.printf("데이터세트 항목의 평균 : %.2f\n", calc.getMean());
        System.out.printf("데이터세트 항목의 표준편차 : %.2f\n", calc.getStandardDeviation());
        System.out.printf("데이터세트 항목의 최댓값 : %.2f\n", calc.getMax());
        System.out.printf("데이터세트 항목의 최솟값 : %.2f\n", calc.getMin());
    }
}
