package chapter.three.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 연습 3.2:
 * 1과 10000 사이의 정수 중 어느 정수가 가장 많은 수의 약수들을 가지고 있는가, 그리고 그 정수는 몇 개의 약수들을 가지는가?
 * 프로그램을 작성하여 해답을 찾고 결과를 출력하라.
 * 이 범위의 여러 정수들은 약수들의 최대 갯수가 동일할 수 있다.
 * 프로그램은 이들 중 하나만 출력해야 한다.
 */
public class Exercise2 {
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
        Collections.shuffle(maxArr);

        System.out.printf("%d ~ %d 사이의 정수 중 가장 많은 약수를 가진 숫자 : %d%n", MIN_VALUE, MAX_VALUE, maxArr.get(0));
        System.out.printf("약수의 개수 : %d%n", max);

    }

    private static int countDivisors(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> (n % i == 0)).count();
    }
}