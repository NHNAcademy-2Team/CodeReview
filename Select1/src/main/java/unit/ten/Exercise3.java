package unit.ten;

public class Exercise3 {
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0){
            return ackermann(m-1, n);
        } else
            return ackermann(m-1,ackermann(m,n-1));
    }

    public static void main(String[] args) {
        int m = 3, n = 5;
        System.out.println("Ackermann 함수 결과는 " + ackermann(m,n));
    }
}
