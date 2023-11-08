package chapter.four;

import java.util.Arrays;

public class Exercise5 {
    public static final double[][] TEST_CASE = {
            {1.0, 2.2, 3.1, 3.3, 5.1, 10.2},
            {1.0, 3.1, 2.2, 3.3, 10.2, 5.1}
    };

    public static final ArrayProcessor maxOfArray = (doubleArray) -> {
        Arrays.sort(doubleArray);
        return doubleArray[doubleArray.length - 1];
    };

    public static final ArrayProcessor minOfArray = (doubleArray) -> {
        Arrays.sort(doubleArray);
        return doubleArray[0];
    };

    public static final ArrayProcessor sumOfArray = (doubleArray) -> {
        double sum = 0;
        for (double operand : doubleArray) {
            sum += operand;
        }
        return sum;
    };

    public static final ArrayProcessor avgOfArray =
            (doubleArray) -> sumOfArray.apply(doubleArray) / doubleArray.length;

    public static ArrayProcessor counter(double value) {
        return (doubleArray) -> {
            int count = 0;
            for (int i = 0; i < doubleArray.length; i++) {
                if (value == doubleArray[i]) {
                    count++;
                }
            }
            return count;
        };
    }

    public static void main(String[] args) {
        System.out.println(maxOfArray.apply(TEST_CASE[0]));
        System.out.println(minOfArray.apply(TEST_CASE[1]));
        System.out.println(sumOfArray.apply(TEST_CASE[0]));
        System.out.printf("%.2f%n", avgOfArray.apply(TEST_CASE[0]));

        System.out.println(counter(10.2).apply(TEST_CASE[0]));
        System.out.println(counter(10).apply(TEST_CASE[0]));
    }
}
