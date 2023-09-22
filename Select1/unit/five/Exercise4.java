package unit.five;

import java.util.Arrays;

public class Exercise4 {
    public static double[] lengthTriangle(double a, double b, double c){
        double[] result = {a, b, c};
        Arrays.sort(result);
        return result;
    }
    public static boolean triangularInequality(double a, double b, double c){
        boolean result = false;
        double[] sort = lengthTriangle(a, b, c);
        if(sort[0] + sort[1] > sort[2]){
            result = true;
        }
        return result;
    }
    public static double perimeterTriangle(double a, double b, double c){
        return a + b + c;
    }
    public static double areaTriangle(double a, double b, double c){
        double s = (a + b + c) / 2;
        double result = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return result;
    }
    public static void triangleType(double a, double b, double c){
        if(a == b && b == c){
            System.out.println("it is regular");
        }else if(a == b || b == c || a == c){
            System.out.println("it is symetric");
        }else{
            System.out.println("it is irregular");
        }
    }
    public static void test(int a, int b, int c){
        double[] sample = lengthTriangle(a, b, c);
        System.out.println("가장 짧은 변 : " + sample[0] + ", 중간 변 : " + sample[1] + ", 긴 변 :" + sample[2]);
        System.out.println(triangularInequality(a, b, c));
        System.out.println(perimeterTriangle(a, b, c));
        System.out.println(areaTriangle(a, b, c));
        triangleType(a, b, c);
    }

    public static void main(String[] args) {
        test(3, 4, 5);
        test(3, 3, 3);
        test(1, 2, 3);
        test(2, 2, 3);
    }
}
