package chapter.four.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        double[] arr = new double[] {1.9, 2.2, 3.1, 2.2222, 3, 3.2, 2.2, 2.2, 2.2};
        System.out.println(max().apply(arr));
        System.out.println(min().apply(arr));
        System.out.println(sum().apply(arr));
        System.out.println(avg().apply(arr));
        System.out.println(counter(2.2).apply(arr));
    }
    public static ArrayProcessor max(){
        return arr -> {
            double maxValue = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(maxValue < arr[i]){
                    maxValue = arr[i];
                }
            }
            return maxValue;
        };
    }

    public static ArrayProcessor min(){
        return arr -> {
            double minValue = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(minValue > arr[i]){
                    minValue = arr[i];
                }
            }
            return minValue;
        };
    }

    public static ArrayProcessor sum(){
        return arr -> {
            double sumArr = 0;
            for(int i = 0; i < arr.length; i++){
                sumArr += arr[i];
            }
            return sumArr;
        };
    }

    public static ArrayProcessor avg(){
        return arr -> sum().apply(arr) / arr.length;
    }
    public static ArrayProcessor counter(double value) {
        return arr -> {
            int count = 0;
            for(double num : arr){
                if(num == value){
                    count++;
                }
            }
            return count;
        };
    }
}
