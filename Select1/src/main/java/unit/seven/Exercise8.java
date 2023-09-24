package CodeReview.Select1.src.main.java.unit.seven;

public class Exercise8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 3, 4};
        System.out.println(mystery(a));

        //배열 내 홀수의 개수
    }

    public static int mystery(int[] a) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                x++;
            }
        }
        return x;
    }
}
