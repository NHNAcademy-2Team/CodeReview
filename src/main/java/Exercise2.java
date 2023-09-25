package seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static ArrayList<Integer> interSection(int[] a, int[] b, int n, int m) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] > b[p2]) p2++;
            else if (a[p1] < b[p2]) p1++;
            else {
                answer.add(a[p1++]);
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }

        for (int x : interSection(a, b, n, m)) {
            System.out.print(x + " ");
        }
    }
}
