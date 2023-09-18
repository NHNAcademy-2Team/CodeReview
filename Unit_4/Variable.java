// 04.6, 04.7
public class Variable {
    public static void main(String[] args) {
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        boolean b1, b2;

        // 04.6
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

        // 04.7
        // s = 65L; // short에 long이 들어가서 에러 생김
        // f = i + 100; // i의 값이 없는 상태에서 + 연산을 하려고 하니 에러 생김
        // i = 2 * b + l; // int(4byte)에 long(8byte)이 들어가서 에러 생김
        // b1 = s; // short(2byte)에 boolean(1byte)이 들어가서 에러가 생김
        // b2 = s >= 57; // s의 값이 없는 상태에서 비교연산자를 실행하려고 하니 에러가 생김
        // c = b; // 자바의 경우 유니코드를 사용하는데 2byte로 문자를 표현하기 때문에 에러가 생김
        c = 'b';
    }
}
