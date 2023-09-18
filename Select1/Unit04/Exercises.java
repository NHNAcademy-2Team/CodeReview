<<<<<<<HEAD

package Select1.Unit04;

import java.util.Scanner;

public class Exercise_unit4 {

    // 4.1
    public static double convertLireEuro(int x) {
        // x를 Euro로 바꾸기
        double euro = 0.000516;
        return x * euro;
    }

    // 4.2
    public static boolean sumOverflow(byte x, byte y) {
        short a = x;
        short b = y;
        if (a + b <= 128 && a + b >= -128) {
            return true;
        }
        return false;
    }

    // 4.3
    public static void arithmetic(int a, int b) {
        System.out.println((a + b) / 2); // Math 함수에 평균값 메소드는 없는 듯
    }

    public static void geometric(int a, int b) {
        System.out.println(Math.pow(a * b, 2));
    }

    public static void greaater(int a, int b) {
        System.out.println("Max : " + Math.max(a, b));
        System.out.println("Min : " + Math.min(a, b));
    }

    // 4.4
    public static boolean even(long x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    // 4.5
    public static void correct() {
        short x = 22;
        byte y = (byte) x;
        System.out.println(y);
    }

    // 4.6
    /*
     * 1. b+10L => long
     * 2. (b+i)*l => long
     * 3. (b+i)*l+f => float
     * 4. s/f + Math.sin(f) => float
     * 5. c == 'b' => boolean
     * 6. 1+1.5f => float
     * 7. i < 10 => boolean
     * 8. b1 == (f >= 5.0) => boolean
     * 9. b1 && !b2 => boolean
     */

    // 4.7
    /*
     * 1. s = 65L; //Error. long이 자신보다 작은 short에 들어갈 수 없음
     * 2. f = i+100; //Correct. float이 int보다 크기 때문에 값이 들어갈 수 있음
     * 3. i = 2*b + l; //Error. long은 int에 들어갈 수 없음
     * 4. b1 = s; //Error. short는 byte에 들어갈 수 없음
     * 5. b2 = s >= 57; //Error. b2는 boolean이 아님
     * 6. c = b; //Error. char는 String 혹은 int만 저장 가능? > 모르겠음
     * 7. c = 'b'; //Correct. char는 한 문자만 저장할 수 있음
     */

    // 4.10
    public static char lastCaracter(String s) {
        return s.charAt(s.length() - 1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("a : ");
        int a = scan.nextInt();
        System.out.print("b : ");
        int b = scan.nextInt();

        System.out.println(sumOverflow((byte) 128, (byte) 128));

        arithmetic(a, b);
        geometric(a, b);
        greaater(a, b);

        even(11);

        // 4.10
        System.out.println(lastCaracter("Hello"));

    }

}=======p

    /**
     * *
     * Exercise 04.1
     * 
     */
    public static double convertLireEuro(int x) {
        final double exchangeRate = 0.03d;
        return exchangeRate * x;
    }

    /** 
     * 
     * Exercise 04.2
     * 
     */
    pu blic

    static boolean sumOverflow(byte x, byte y) {
        short shortX = x;
        short shortY = y;
        int s = shortX + shortY;
        return (-128 <= s) && (s <= 127);
    }

    /**
     * 
     * Exercise 04.3
     *  
     */
    public static void useMath(int x, in { 
        System.out.println((x + y) / 2);
        System.out.println(Math.sqrt(x * y));
        System.out.println("큰 숫자 : " + Math.max(x, y) + ", 작은 숫자 : " + Math.min(x, y));
    }

    /**
     * 
     * Exercise 04.4
     * 
     */
    public static boolean even(long x) {
        return x % 2 == 0;
    }

    /**
     * 
     * Exercise 04.5
     * 
     */
    pu blic

    static void casting() {
        short x = 22;
        byte y = (byte) x;
        System.out.println(y);
    }

    /**
     * 
     *
     * * b+10L => Long
     * * (b+i)*l => Long
     * * (b+i)*l+f => Float
     * * s/f + Math.sin(f) => Float
     * * c == 'b' => Boolean
     * * l+1.5f => Float
     * * i<10 => Boolean
     * * b1 == (f >= 5.0) => Boolean
     * * b1 && !b2 => Boolean
     */

    /*
     * *
     *
     * * Exercise 04.7
     * * s = 65L; => 오류
     * * f = i+100;
     * * i = 2*b l; => 오류
     * * b1 = s; => 오류
     * * b2 = s 57; => 오류
     * * c = b;
     * c = 'b';
     */

    /**
     * 
     * Exercise 04.9
     * 
     */

    char last = s.charAt(s.length() - 1);return last;
    }

    public static void main(String[] args) {
        System.out.println(conv

        System.out.println(even(4));
        casting();
        System.out.println(lastCharacter("string"));
    }
}>>>>>>>0 adeb045ec790b6e13b956dbb5fbf028d82fe2c3


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

 



       
     
        

     