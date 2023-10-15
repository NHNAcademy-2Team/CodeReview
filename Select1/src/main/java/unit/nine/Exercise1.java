package unit.nine;

/**
 * Determine whether the following program will generate (i) compilation errors, (ii) runtime errors.
 * If the program does not generate errors, say what it will print out; if the program generates errors, correct them and say what it will print out after the correction. Motivate your answers.
 *
 */
public class Exercise1 {
    public static void main(String[] args) {
//        for (int i = 0, j = 0; i < 10, j < 10; i++, j++){
//            System.out.println(i + " + " + j + " = " + (i + j));
//        }
//        System.out.println("I've printed out the sums of i and j up to" + i + "," + j);
    }
}

//오류
// 컴파일 오류 : j<10이 문제인 것 같은데 왜인지 모르겠음
// 런타임 오류 : i와 j가 for문 안에서만 동작하기 때문에 for 문 밖에서의 i, j는 인식할 수 없음
