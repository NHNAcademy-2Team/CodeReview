package src.main.java.unit7;

public class Exercise6 {

    static int numberOfDuplicates(int[] A) { // 중복되는 요소의 개수
        int count =0;
        for (int i = 0; i < A.length ; i++) {
            for (int j = i+1 ; j < A.length ; j++) {
                if(A[i] == (Integer)null) {
                    break;
                }
                if (A[i]==A[j]) {
                    A[j] = (Integer)null;
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
