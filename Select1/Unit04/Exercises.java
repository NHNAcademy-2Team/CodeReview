<<<<<<< HEAD
package Select1.Unit04;

import java.util.Scanner;

public class Exercise_unit4 {

    //4.1
    public static double convertLireEuro(int x) {
        //x를 Euro로 바꾸기
        double euro = 0.000516;
        return x * euro;
    }

    //4.2
    public static boolean sumOverflow(byte x, byte y) {
        short a = x;
        short b = y;
        if (a + b <= 128 && a + b >= -128) {
            return true;
        }
        return false;
    }

    //4.3
    public static void arithmetic(int a, int b) {
        System.out.println((a + b) / 2);    //Math 함수에 평균값 메소드는 없는 듯
    }

    public static void geometric(int a, int b) {
        System.out.println(Math.pow(a*b, 2));
    }

    public static void greaater(int a, int b) {
        System.out.println("Max : " + Math.max(a, b));
        System.out.println("Min : " + Math.min(a, b));
    }

    //4.4
    public static boolean even(long x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    //4.5
    public static void correct() {
        short x = 22;
        byte y = (byte) x;
        System.out.println(y);
    }

    //4.6
    /* 
    1. b+10L => long
    2. (b+i)*l => long
    3. (b+i)*l+f => float
    4. s/f + Math.sin(f) => float
    5. c == 'b' => boolean
    6. 1+1.5f => float
    7. i < 10 => boolean
    8. b1 == (f >= 5.0) => boolean
    9. b1 && !b2 => boolean
    */

    //4.7
    /* 
    1. s = 65L; //Error. long이 자신보다 작은 short에 들어갈 수 없음
    2. f = i+100; //Correct. float이 int보다 크기 때문에 값이 들어갈 수 있음
    3. i = 2*b + l; //Error. long은 int에 들어갈 수 없음
    4. b1 = s;  //Error. short는 byte에 들어갈 수 없음
    5. b2 = s >= 57;    //Error. b2는 boolean이 아님
    6. c = b;   //Error. char는 String 혹은 int만 저장 가능? > 모르겠음
    7. c = 'b'; //Correct. char는 한 문자만 저장할 수 있음
    */

    //4.10
    public static char lastCaracter(String s) {
        return s.charAt(s.length()-1);
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

        //4.10
        System.out.println(lastCaracter("Hello"));

    }
    
}
=======
public class Exercises{
    /**
     * 
     * Exercise 04.1
     * 
     */
    public static double convertLireEuro(int x){
        final double exchangeRate = 0.03d;
        return exchangeRate * x;
    }

    /**
     * 
     * Exercise 04.2
     * 
     */
    public static boolean sumOverflow(byte x, byte y){
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
    public static void useMath(int x, int y){
        System.out.println((x + y) / 2);
        System.out.println(Math.sqrt(x * y));
        System.out.println("큰 숫자 : " + Math.max(x, y) + ", 작은 숫자 : " + Math.min(x, y));
    }

    /**
     * 
     * Exercise 04.4
     * 
     */
    public static boolean even(long x){
        return x % 2 == 0;
    }

    /**
     * 
     * Exercise 04.5
     * 
     */
    public static void casting(){
        short x = 22;
        byte y = (byte)x;
        System.out.println(y);
    }

    /**
     * 
     * Exercise 04.6
     * b+10L => Long
     * (b+i)*l => Long
     * (b+i)*l+f => Float
     * s/f + Math.sin(f) => Float
     * c == 'b' => Boolean
     * l+1.5f => Float
     * i<10 => Boolean
     * b1 == (f >= 5.0) => Boolean
     * b1 && !b2 => Boolean
     */

    /**
     * 
     * Exercise 04.7    
     * s = 65L; => 오류
     * f = i+100;
     * i = 2*b + l; => 오류
     * b1 = s; => 오류
     * b2 = s >= 57; => 오류
     * c = b;
     * c = 'b';
     */

    /**
     * 
     * Exercise 04.9   
     * 
     */
    public static char lastCharacter(String s){
        char last = s.charAt(s.length()-1);
        return last;
    }
    public static void main(String[] args) {
        System.out.println(convertLireEuro(100));
        System.out.println(sumOverflow((byte)0, (byte)128));
        useMath(3, 4);
        System.out.println(even(4));
        casting();
        System.out.println(lastCharacter("string"));
    }
}
>>>>>>> 0adeb045ec790b6e13b956dbb5fbf028d82fe2c3
