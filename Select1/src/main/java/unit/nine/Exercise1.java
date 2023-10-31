package unit.nine;

public class Exercise1 {

    // 수정 후
    public static void main(String[] args) {

        int i, j;
        for (i = 0, j = 0; i < 10 && j < 10; i++, j++) {
            System.out.println(i + " + " + j + " = " + (i + j));
        }
        System.out.println("I've printed out the sums of i and j up to : " + i + ", " + j);
    }

    // 수정 전 -> 컴파일 오류 발생
    // public class Exercise1 {
    // public static void main(String[] args) {
    // for (int i = 0, j = 0; i < 10, j < 10; i++, j++) {
    // System.out.println(i + " + " + j + " = " + (i+j));
    // }
    // System.out.println("I've printed out the sums of i and j up to "
    // + i + "," + j);
    // }
    // }
}
