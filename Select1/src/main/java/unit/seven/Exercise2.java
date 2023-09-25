package src.main.java.unit.seven;

public class Exercise2 {

    static int[] intersection(int[] arrayA, int[] arrayB) {
        int count = 0;
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    count++;
                    break;
                }
            }
        }

        int[] result = new int[count];
        count = 0;
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    result[count] = arrayA[i];
                    count++;
                    break;
                }
            }
        }
        return result;
    }
}
