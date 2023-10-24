package chapter.nine;

public class Exercise1 {
    public static void main(String[] args) {
        int i = 3, j = 6;
        for (i = 0, j =0; i < 10 &&j < 10; i++, j++) {
            System.out.println(i + " + "+ j +" = " + (i+j));
        }
        System.out.println("I've printed out the sums of i and j up to" + i+ "," + j);
    }
}
