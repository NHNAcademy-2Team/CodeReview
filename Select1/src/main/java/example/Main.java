package example;

public class Main {
    private static void gcdMax(int[] arr) {
        int[][] combination = MyMath.combinationArr(arr, 2);
        int[] gcd = MyMath.gcdAllAll(combination);
        int answer = MyMath.maxAll(gcd);
        System.out.println(answer);
    }

    private static void gcdTest() {
        int[][] test = {{10, 20, 30, 40}, {5, 7, 12}};
        for (int[] t : test) {
            gcdMax(t);
        }
    }

    public static void main(String[] args) {
        gcdTest();
    }
}
