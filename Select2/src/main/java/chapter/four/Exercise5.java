package chapter.four;

public class Exercise5 {
    public static void main(String[] args) {
        double[] array = {1.0, 4.4, 9.7, 15.9};
        System.out.println(counter(4.4).apply(array));

        System.out.println(max.apply(array));
        System.out.println(min.apply(array));
        System.out.println(sum.apply(array));
        System.out.println(avg.apply(array));
    }

    public static ArrayProcessor counter(double value) {
        return (array) -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    count++;
                }
            }
            return count;
        };
    }

    public static ArrayProcessor max = (array) -> {
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    };

    public static ArrayProcessor min = (array) -> {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    };

    public static ArrayProcessor sum = (array) -> {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    };

    public static ArrayProcessor avg = (array) -> {
        double avg = 0;
        return sum.apply(array) / array.length;
    };
}
