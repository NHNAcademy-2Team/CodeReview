package src.main.java.unit7;

public class Exercise7 extends Exercise6 {

    static int[] removeDuplicates(int[] A) {
        int[] result = new int[numberOfDistinctValues(A)];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == (Integer) null) {
                    break;
                }
                if (A[i] == A[j]) {
                    A[j] = (Integer) null;
                }
            }
            if (A[i] != (Integer) null) {
                result[count++] = A[i];
            }
        }
        return result;
    }
}
