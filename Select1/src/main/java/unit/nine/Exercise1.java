package unit.nine;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni09/node26.html
 * Exercise 09.1 Determine whether the following program will generate (i) compilation errors, (ii) runtime errors. If the program does not generate errors, say what it will print out; if the program generates errors, correct them and say what it will print out after the correction. Motivate your answers.
 * <p>
 * 컴파일 오류
 */
public class Exercise1 {
    public static void main(String[] args) {
//        for (int i = 0, j = 0; i < 10, j < 10; i++, j++) {
//            System.out.println(i + " + " + j + " = " + (i+j));
//        }
//        System.out.println("I've printed out the sums of i and j up to " + i + "," + j);

        // 수정하기
        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.println(i + " + " + j + " = " + (i + j));
            if (i == 9) {
                System.out.println("i와 j의 합을 최대로 출력했습니다. " + i + "," + j);
            }
        }
    }
}
