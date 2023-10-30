package chapter.three;

public class Exercise2 {

    //1과 10000 사이의 정수 중 어느 정수가 가장 많은 수의 약수들을 가지고 있는가, 그리고 그 정수는 몇 개의 약수들을 가지는가?
    //여러 정수들은 약수들의 최대 갯수가 동일할 수 있다. 프로그램은 이들 중 하나만 출력해야 한다.
    //보류

    public static void main(String[] args) {

        Yaksu yaksu = new Yaksu(1, 10000);
        System.out.println(yaksu.toString());

    }


}

class Yaksu {

    private int start;
    private int end;
    private int num;
    private int max;


    public Yaksu(int start, int end) {
        this.start = start;
        this.end = end;
        count();
    }

    public void count() {

        for (int i = this.start; i <= this.end; i++) {
            max(i, yaksu(i));
        }
    }

    public int yaksu(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public void max(int num, int count) {
        if (max < count) {
            this.max = count;
            this.num = num;
        }
    }

    public String toString() {
        return this.num + " : " + this.max;
    }
}