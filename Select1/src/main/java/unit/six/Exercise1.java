package unit.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    public static int getMin(int[] min) {
        int mMin = 0;
        for (int i = 0; i < min.length; i++) {
            if (i == 0 || (min[i] < mMin))
                mMin = min[i];
        }
        return mMin;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("10개의 정수를 입력하세요.");
            nums[i] = Integer.parseInt(in.readLine());
        }

        System.out.printf("가장 작은 수: %d\n", getMin(nums));

    }
}
