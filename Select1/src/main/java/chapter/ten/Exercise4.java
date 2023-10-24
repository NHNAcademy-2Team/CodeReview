package chapter.ten;

public class Exercise4 {
    /* 최대공약수 구히기*/
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else
            return gcd(num2, num1 % num2);
    }

    /* 두 개의 양의 정수가 상대적 소수인지 */
    public static boolean isPrime(int num1, int num2){
        return gcd(num1, num2) == 1;
    }

    /* 정수와 양의 정수 사이의 나머지 부분 */

    public static void main(String[] args) {
        int num1 = 15, num2 = 2;
        System.out.println(num1 + "과 " + num2 + "의 최대공약수는 " + gcd(num1, num2));

        boolean result = isPrime(num1, num2);
        if(result){
            System.out.println(num1 + "과 " + num2 +"는 상대적 소수입니다.");
        } else
            System.out.println(num1 + "과 " + num2 + "는 상대적 소수가 아닙니다.");
    }
}
