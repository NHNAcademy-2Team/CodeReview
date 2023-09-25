package src.main.java.unit.seven;

public class Exercise2 {

    static int[] intersection(int[] A, int[] B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    count++;
                    break;
                }
            }
        }

        int[] result = new int[count];
        count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    result[count] = A[i];
                    count++;
                    break;
                }
            }
        }
        return result;
    }
}
