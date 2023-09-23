package unit.six;

public class Exercise5 {
    public static double calculateSeries(int n){
        double series = 0;
        double value = 1;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                series += (4 / value);
            }else{
                series -= (4 / value);
            }
            value += 2;
        }
        return series;
    }

    public static void main(String[] args) {
        System.out.println(calculateSeries(4));
    }
}
