package chapter.seven;

public class Exercise8 {
    /*
    *   홀수 개수 구하기
    */
    public static int mystery(int[] a) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] a = {3,4,5,6,7,8,9};

        System.out.println(mystery(a));
    }
}
