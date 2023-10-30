package chapter.three;

public class Exercise2 {

    public static void mostDivisors(int number){
        int maxDivisor = 0;
        int maxNumver = 0;
        for (int i = 0; i < number; i++) {
            if(maxDivisor < divisors(i)){
                maxDivisor = divisors(i);
                maxNumver = i;
            }
        }
        System.out.println("가장 많은 약수를 가진 정수 : " + maxNumver + "\n약수의 수 : " + maxDivisor);
    }

    public static int divisors(int number){
        int count = 0;

        for (int i = 1; i * i <= number; i++) {
            if(i*i == number)
                count++;
            else if(number % i == 0)
                count +=2;
        }
        return count;
    }

    public static void main(String[] args) {
        mostDivisors(10000);
    }
}
