package Unit4_Exercise;

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

    //4.8
    public static void method(int a, Account b) {
        a *= 2;
        b.bal *= 2;
    }

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

        arithmetic(a, b);
        geometric(a, b);
        greaater(a, b);

        even(11);


        //4.8 프로그램 실행 시 어떤 것이 출력됩니까?
        //Account
        int c = 100;
        Account r = new Account(100);
        method(c, r);
        System.out.println(c + " " + r.bal);  //100 200
        //c는 int값을 매개변수에서 복사하여 값을 변경했지만, method()가 종료되면 복사된 int 값이 사라지기 때문에 원래의 c값이 출력
        //r.bal은 객체 자체를 매개변수로 주어 참조변수 내의 데이터를 변경시켰기 때문에 변경된 값 출력

        //4.9
        //TestProduct

        //4.10
        System.out.println(lastCaracter("Hello"));

    }
    
}
