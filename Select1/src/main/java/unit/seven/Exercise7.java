package src.main.java.unit.seven;

public class Exercise7 extends Exercise6 {

    static int[] removeDuplicates(int[] Array) {
        int[] result = new int[numberOfDistinctValues(Array)];
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i] == (Integer) null) {
                    break;
                }
                if (Array[i] == Array[j]) {
                    Array[j] = (Integer) null;
                }
            }
            if (Array[i] != (Integer) null) {
                result[count++] = Array[i];
            }
        }
        return result;
    }
}
