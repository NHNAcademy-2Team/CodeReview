package four;

public class Exercise5 {
    // ArrayProcessor
    public static void main(String[] args) {

        double[] list = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(counter(10).apply(list));
        System.out.println(sum.apply(list));
        System.out.println(average.apply(list));
        System.out.println(maximum.apply(list));
        System.out.println(minimum.apply(list));
    }

    // 최대,최소,총합,평균

    public static ArrayProcessor maximum = array -> {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    };

    public static ArrayProcessor minimum = array -> {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    };

    public static ArrayProcessor sum = array -> {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    };

    public static ArrayProcessor average = array -> {
        return sum.apply(array) / array.length;
    };

    // 특정 수의 개수
    public static final ArrayProcessor counter(double num) {
        return array -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num) {
                    count++;
                }
            }
            return count;
        };
    }
}