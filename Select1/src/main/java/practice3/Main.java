package practice3;

public class Main {

    public static void main(String[] args) {

        System.out.println(calc(1, 10, 1, new Adder()));
        System.out.println(calc(1, 10, 1, new Multiplier()));

    }

    public static int calc(int start, int end, int step, Adder adder) {
        int result = 0;
        for (int i = start; i <= end; i += step) {
            result = adder.binder(result, i);
        }

        return result;
    }

    public static int calc(int start, int end, int step, Multiplier multy) {
        int result = 1;
        for (int i = start; i <= end; i += step) {
            result = multy.binder(result, i);
        }

        return result;
    }


}



