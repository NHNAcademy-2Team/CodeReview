package chapter.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {
    private static final int DOZEN = 12;
    private static final int GROSS = DOZEN * DOZEN;

    public static void main(String[] args) {
        outputEggInformation(inputEggInformation());
    }

    private static int inputEggInformation() {
        int eggNum;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("달걀의 개수를 입력해주세요 : ");
            eggNum = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return eggNum;
    }

    private static void outputEggInformation(int eggNum) {
        if(eggNum < 0)
            throw new IllegalArgumentException("음수는 들어올 수 없습니다.");
        int grossNum = eggNum / GROSS;
        int dozenNUm = (eggNum % GROSS) / DOZEN;
        int rest = (eggNum % GROSS) % DOZEN;
        System.out.printf("Your number of eggs is %d gross, %d dozen, and %d", grossNum, dozenNUm, rest);
    }
}
