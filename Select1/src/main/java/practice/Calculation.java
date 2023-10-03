package practice;

public class Calculation {

    public static int Calc(int start, int end, int step, Adder adder) {
        int result = 0;
        for (int i = start; i <= end; i += step) {
            result = adder.adder(result, i);
        }
        return result;
    }

    public static int Calc(int start, int end, int step, Multipler multipler) {
        int result = 1;
        for (int i = start; i <= end; i += step) {
            result = multipler.multipler(result, i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Calc(1,10,1, new Adder()));
        System.out.println(Calc(1,10,1, new Multipler()));
    }
}
