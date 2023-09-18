import java.util.Scanner;

public class Exercises {

    // Exercise 04.1
    public static double convertLireEuro(double x) {
        return x / 1936.27;
    }

    // Exercise 04.2
    public static boolean sumOverflow(byte x, byte y) {
        short a = x;
        short b = y;
        int sum = a + b;

        if (sum >= -128 && sum <= 127) {
            return false;
        } else {
            return true;
        }
    }

    // Exercise 04.3
    public static void printNumber(double x, double y) {
        System.out.println("산술 평균 : " + arithmeticMean(x, y));
        System.out.println("기하 평균 : " + geometricMean(x, y));
        System.out.println("큰 수 : " + Math.max(x, y));
        System.out.println("작은 수 : " + Math.min(x, y));
    }

    public static double arithmeticMean(double x, double y) {
        return (x + y) / 2.0;
    }

    public static double geometricMean(double x, double y) {
        return Math.sqrt(x + y);
    }

    // Exercise 04.4
    public static boolean even(long x) {
        return (x % 2 == 0) ? true : false;
    }

    // Exercise 04.10
    public static char lastCharacter(String s) {
        return s.charAt(s.length() - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercise 04.1
        System.out.println(convertLireEuro(50000.0));

        // Exercise 04.2
        System.out.println("Overflow를 유발하는 값? : " + sumOverflow((byte) 1, (byte) 2));

        // Exercise 04.3
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        printNumber(x, y);

        // Exercise 04.4
        System.out.println("짝수입니까? : " + even(17));

        // Exercise 04.5
        short num1 = 22;
        byte num2 = (byte) num1;
        System.out.println(num2);

        // Exercise 04.6
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        boolean b1, b2;

        /*
         * b + 10L // long
         * (b + i) * l // long
         * (b + i) * l + f // float
         * s / f + Math.sin(f) // double
         * c == 'b' // boolean
         * l + 1.5f // float
         * i < 10 // boolean
         * b1 == (f >= 5.0) // boolean
         * b1 && !b2 // boolean
         */

        // Exercise 04.7
        // s = 65L; // short에 long이 들어가서 에러 생김
        // f = i + 100; // i의 값이 없는 상태에서 + 연산을 하려고 하니 에러 생김
        // i = 2 * b + l; // int(4byte)에 long(8byte)이 들어가서 에러 생김
        // b1 = s; // short(2byte)에 boolean(1byte)이 들어가서 에러가 생김
        // b2 = s >= 57; // s의 값이 없는 상태에서 비교연산자를 실행하려고 하니 에러가 생김
        // c = b; // 자바의 경우 유니코드를 사용하는데 2byte로 문자를 표현하기 때문에 에러가 생김
        c = 'b';

        // Exercise 04.10
        System.out.println(lastCharacter("school"));
        scanner.close();
    }
}
