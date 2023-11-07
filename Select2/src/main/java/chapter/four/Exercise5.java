package chapter.four;

public class Exercise5 {
    // max, min, sum, avg, counter

    public static final ArrayProcessor max = array -> {
        double maxNum = 0.0;
        for(double i : array){
            if(maxNum < i)
                maxNum = i;
        }
        return maxNum;
    };

    public static final ArrayProcessor min = array -> {
        double minNum = array[0];
        for(double i : array){
            if(minNum > i)
                minNum = i;
        }
        return minNum;
    };

    public static final ArrayProcessor sum = array -> {
        double sumNum = 0.0;
        for(double i : array){
            sumNum += i;
        }
        return sumNum;
    };

    public static final ArrayProcessor avg = array ->
        sum.apply(array) / array.length;


    public static ArrayProcessor counter( double number ) {
        return array -> {
            int count = 0;
            for (double i : array) {
                if (number == i)
                    count++;
            }
            return count;
        };
    }


    public static void main(String[] args) {
        double[] x = {0.01, 1.12, 2.21};

        System.out.println(max.apply(x));
        System.out.println(min.apply(x));
        System.out.println(sum.apply(x));
        System.out.println(avg.apply(x));
        System.out.println(counter(0.01).apply(x));
    }
}
