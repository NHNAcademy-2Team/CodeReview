package unit.seven;

import java.util.Arrays;
/*
* 중복 항목 수와 중복되지 않은 항목 수 출력
*
* [오답 정리] */
public class Exercise6 {
    public static int numberOfDuplicates(int[] a) {
        return a.length - numberOfDistinctValues(a);
    }

    public static int numberOfDistinctValues(int[] a) {
        int count = 1;

        for (int i = 0; i < a.length-1; i++) {
            if(a[i] != a[i+1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] number = {5, 7, 2, 9, 5};

        Arrays.sort(number);

        System.out.println(numberOfDuplicates(number) + " 개가 중복됨");
        System.out.println("중복되지 않는 항목 수는 " + numberOfDistinctValues(number));
    }
}
