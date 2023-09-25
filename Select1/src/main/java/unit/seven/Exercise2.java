package unit.seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static ArrayList<Integer> interSection(int[] a, int[] b, int n, int m) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;

        // 앞에서부터 차례대로 비교
        // 더 작은 값을 가진 배열의 인덱스를 증가, 같다면 값을 추가하고 둘 다 증가
        while (p1 < n && p2 < m) {
            if (a[p1] > b[p2]) p2++; // 더 적은 배열의 값을 가진 인덱스 증가
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
        System.out.print("a 배열의 크기: ");
        int n = scn.nextInt();

        System.out.print("a 배열의 값: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        System.out.print("b 배열의 크기: ");
        int m = scn.nextInt();
        int[] b = new int[m];

        System.out.print("b 배열의 값: ");
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }

        for (int x : interSection(a, b, n, m)) {
            System.out.print(x + " ");
        }
    }
}
