package unit.seven;

public class Exercise2 {

    // 보류
    public static int[] intersection(int[] A, int[] B) {
        int[] result;
        if (A.length <= B.length) {
            result = new int[A.length];
        } else {
            result = new int[B.length];
        }

        for (int i = 0, j = 0; i < result.length; i++) {
            for (int k = 0; k < result.length; k++) {
                if (A[i] == B[k]) {
                    result[j] = A[i];
                }
            }
        }
        return result;
    }
}
