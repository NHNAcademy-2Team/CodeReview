package chapter.three.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Exercise6 {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 10000;

    public static void main(String[] args) {
        printMaxCountDivisor();
    }

    private static void printMaxCountDivisor() {
        List<Integer> maxArr = new ArrayList<>();
        int max = 0;

        for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
            int count = countDivisors(i);
            if (count > max) {
                maxArr = new ArrayList<>();
                maxArr.add(i);
                max = count;
            } else if (count == max) {
                maxArr.add(i);
            }
        }

        System.out.printf("%d과 %d 사이의 정수 중에서,%n", MIN_VALUE, MAX_VALUE);
        System.out.printf("약수의 최대 갯수는 %d%n", max);
        System.out.println("이러한 약수의 갯수를 가진 숫자들은:");
        for (Integer maxNumber : maxArr) {
            System.out.println(maxNumber);
        }
    }

    private static int countDivisors(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> (n % i == 0)).count();
    }
}
