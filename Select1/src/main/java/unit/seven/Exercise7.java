package unit.seven;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise7 {
    //중복 요소 제외하고, 중복 시 첫번째 요소만 저장한 새 배열 생성
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 6, 7, 8, 9, 9, 9};
        System.out.println(Arrays.toString(removeDuplicates(a)));
    }

    public static int[] removeDuplicates(int[] a) {

        Arrays.sort(a);
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(a[0]);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                list.add(a[i + 1]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
