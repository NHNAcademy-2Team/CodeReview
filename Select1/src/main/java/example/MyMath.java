package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MyMath {
    private MyMath() {
    }

    private static int gcd(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException("양의 정수를 입력해주세요.");
        }
        int temp;
        while (y != 0) {
            temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    private static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("음수입니다.");
        }
        switch (n) {
            case 0:
            case 1:
                return 1;
            default:
                return n * factorial(n - 1);
        }
    }

    private static int combinationOperator(int n, int k) {
        if (n < 0 || k < 0 || n < k) {
            throw new IllegalArgumentException("조합의 조건에 맞지 않습니다. 조합의 조건 nCk일 때) n >= k, n >= 0, k >= 0");
        }
        if (k == 0 || n == k) {
            return 1;
        }

        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static List<ArrayList<Integer>> combination(int[] arr, int k, ArrayList<Integer> list, int index,
                                                        List<ArrayList<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(list));
            return result;
        }

        for (int i = index; i < arr.length; i++) {
            list.add(arr[i]);
            result = combination(arr, k - 1, list, i + 1, result);
            list.remove(list.size() - 1);
        }
        return result;
    }

    public static int[][] combinationArr(int[] n, int k) {
        if (n == null) {
            throw new IllegalArgumentException("배열이 null입니다.");
        }
        if (k <= 1) {
            throw new IllegalArgumentException("k의 값을 1 이상 입력해주세요.");
        }
        Set<Integer> set = Arrays.stream(n).boxed().collect(Collectors.toSet());
        List<ArrayList<Integer>> result =
                combination(set.stream().mapToInt(Integer::intValue).toArray(), k, new ArrayList<>(), 0,
                        new ArrayList<>());
        int[][] comArr = new int[combinationOperator(n.length, k)][k];
        for (int i = 0; i < comArr.length; i++) {
            for (int j = 0; j < comArr[0].length; j++) {
                comArr[i][j] = result.get(i).get(j);
            }
        }
        return comArr;
    }

    private static int gcdAll(int[] arr) {
        return myAll(MyMath::gcd, arr, 2);
    }

    public static int[] gcdAllAll(int[][] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("배열이 null입니다.");
        }
        int[] gcdArr = new int[arr.length];
        int index = 0;
        for (int[] a : arr) {
            gcdArr[index++] = gcdAll(a);
        }
        return gcdArr;
    }

    private static int max(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static int maxAll(int[] arr) {
        return myAll(MyMath::max, arr, 1);
    }

    private static int myAll(java.util.function.IntBinaryOperator binaryOperator, int[] arr, int arrLengthException) {
        if (arr == null) {
            throw new IllegalArgumentException("배열이 null입니다.");
        }
        if (arr.length < arrLengthException) {
            throw new IllegalArgumentException("배열의 길이가 " + arrLengthException + "이상이어야 합니다.");
        }
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            num = binaryOperator.applyAsInt(arr[i], num);
        }
        return num;
    }
}
