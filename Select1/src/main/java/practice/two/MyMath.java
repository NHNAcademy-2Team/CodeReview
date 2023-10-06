package practice.two;

import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;

public class MyMath {
    public static void main(String[] args) {
        System.out.println(calc(1, 10, 1, new Adder()));
        System.out.println(calc(1, 10, 1, new Multiply()));
    }
    public static int calc(int start, int end, int step, Adder adder){
        int result = 0;
        for(int i = start; i <= end; i += step){
            result = adder.bind(result, i);
        }
        return result;
    }

    public static int calc(int start, int end, int step, Multiply multiply){
        int result = 1;
        for(int i = start; i <= end; i += step){
            result = multiply.bind(result, i);
        }
        return result;
    }

    public static int calc(int start, int end, int step, int init, IntBinaryOperator intBinaryOperator){
        int result = init;
        for(int i = start; i <= end; i += step){
            result = intBinaryOperator.applyAsInt(result, i);
        }
        return result;
    }
}
