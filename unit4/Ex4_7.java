package unit4;

public class Ex4_7 {
    public static void main(String[] args) {
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        boolean b1, b2;

        s = (short) 65L; // long 타입은 short보다 범위가 크므로 할당 x
        f = i + 100;
        i = 2 * b + 1;
        b1 = s; // boolean 타입에는 true/ false 값만 할당
        b2 = s >= 57;
        c = b; // char는 문자 하나를 할당받을 수 있으므로
        c = 'b';
    }
}
