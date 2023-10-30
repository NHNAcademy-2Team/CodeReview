package chapter.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise2 {

    //1과 10000 사이의 정수 중 어느 정수가 가장 많은 수의 약수들을 가지고 있는가, 그리고 그 정수는 몇 개의 약수들을 가지는가?
    //여러 정수들은 약수들의 최대 갯수가 동일할 수 있다. 프로그램은 이들 중 하나만 출력해야 한다.
    //보류

    private static int max;
    private static List<Integer> list = new ArrayList<>();
    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        count(1, 10000);
        System.out.println(max());

    }

    public static void count(int start, int end) {
        for (int i = start; i < end; i++) {
            yaksu(i);
        }
    }

    public static void yaksu(int num) {

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        map.put(num, count);
    }

    public static int max() {
        int max = 0;
        for (int i = 0; i < map.size(); i++) {
            if (max < map.get(i)) {
                max = map.get(i);
            }
        }
        return max;
    }


}
