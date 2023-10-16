package eight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    static double inputSum(Scanner scanner) {
        double result = 0.0;
        int inputNum = -1;
        int count = 0;

        while (true) {
            try {
                System.out.print("양수를 입력해주세요(종료 : 0) : ");

                while (inputNum != 0) {
                    inputNum = scanner.nextInt();

                    if (inputNum < 0) {
                        throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
                    }
                    result += inputNum;
                    count++;
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            } catch (InputMismatchException e) {
                System.out.println("잘못된 형식입니다. 정수를 입력해주세요.");
                scanner.nextLine();
            }
        }
        return result / (count - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(inputSum(scanner));

        scanner.close();
    }
}
