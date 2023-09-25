package src.main.java.unit.seven;

public class Exercise6 {

    static int numberOfDuplicates(int[] Array) {
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i] == (Integer) null) {
                    break;
                }
                if (Array[i] == Array[j]) {
                    Array[j] = (Integer) null;
                    count++;
                }
            }
        }
        return count;
    }

    static int numberOfDistinctValues(int[] A) { // 고유값의 요소의 개수
        return A.length - numberOfDuplicates(A);
    }

}
