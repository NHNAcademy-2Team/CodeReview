package chater.two.exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputInformation {
    private InputInformation() {
    }

    public static int[] ChangeInformation() {
        int[] informationArr = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("quater의 수 : ");
            int quarterCount = Integer.parseInt(br.readLine());

            System.out.print("dime의 수 : ");
            int dimeCount = Integer.parseInt(br.readLine());

            System.out.print("nickle의 수 : ");
            int nickleCount = Integer.parseInt(br.readLine());

            System.out.print("penny의 수 : ");
            int pennyCount = Integer.parseInt(br.readLine());

            informationArr = new int[] {quarterCount, dimeCount, nickleCount, pennyCount};
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return informationArr;
    }
}
