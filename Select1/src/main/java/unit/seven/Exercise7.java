package unit.seven;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise7 {
    //보류
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 6, 7, 8, 9, 9, 9};
        System.out.println(Arrays.toString(removeDuplicates(a)));
    }

    public static int[] removeDuplicates(int[] a) {

        Arrays.sort(a);
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(a[0]);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i+1]) {
                list.add(a[i+1]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
