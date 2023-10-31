package chapter.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {

    public static void main(String[] args) {
        //표현식 평가 프로그램

        read();

    }


    public static void read() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            System.out.print("서식을 작성하십시오(0 입력 시 프로그램 종료) : ");
            String[] operation = br.readLine().split(" ");

            if (operation[0].equals("0")) {
                System.out.println("프로그램이 종료됩니다.");
                return;
            }

            print(operation);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print(String[] operation) {
        StringBuilder sb = new StringBuilder();

        if (isNum(operation[0]) && isOperator(operation[1]) && isNum(operation[2])) {
            sb.append(operation[0] + " ");
            sb.append(operation[1] + " ");
            sb.append(operation[2]);

            System.out.println(sb.toString());
        } else {
            System.out.println("서식이 잘못되었습니다");
        }
    }

    public static boolean isNum(String num) {
        try {
            Double.parseDouble(num);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isOperator(String op) {
        String[] operator = {"+", "-", "*", "/"};
        for (int i = 0; i < operator.length; i++) {
            if (op.equals(operator[i])) {
                return true;
            }
        }
        return false;
    }
}
