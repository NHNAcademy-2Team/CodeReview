package CodeReview.Select1.src.main.java.unit.seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
        
        int[] a = new int[10];
        int[] b = new int[10];

        Random rnd = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(100);
            b[i] = rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(intersection(a, b)));
    }

    public static int[] intersection(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();

        a = duplicate(a);
        b = duplicate(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    list.add(a[i]);
                }
            }
        }
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static int[] duplicate(int[] a) {

        Arrays.sort(a);
        
        List<Integer> list = new ArrayList<Integer>();

        for(int b : a) {
            if (!list.contains(b)) {
                list.add(b);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
