package chapter.three;

public class Exercise6 {
    public static void main(String[] args) {
        MostDivisorsWithArray divisors = new MostDivisorsWithArray();
        divisors.mostDivisors(10000);
    }
}

class MostDivisorsWithArray{

    private int[] divisors;
    private int max = 0;

    public MostDivisorsWithArray(){}

    private void countDivisors(int number){
        divisors = new int[number];

        for (int i = 0; i < divisors.length ; i++) {
            divisors[i] = Exercise2.divisors(i+1);

            if(divisors[i] > max)
                max = divisors[i];
        }
    }

    public void mostDivisors(int number){
        countDivisors(number);
        System.out.println("1과" + number + " 사이의 정수 중에서,\n약수의 최대 갯수는 " + max +
                            "\n이러한 약수의 갯수를 가진 숫자들은 : ");
        for (int i = 0; i < divisors.length; i++) {
            if (divisors[i] == max) {
                System.out.println(i+1);
            }
        }
    }
}
