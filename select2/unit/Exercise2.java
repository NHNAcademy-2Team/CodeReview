package unit;

public class Exercise2 {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int roll;


        dice1 = (int) (Math.random() * 6) + 1;
        dice2 = (int) (Math.random() * 6) + 1;
        roll = dice1 + dice2;

        System.out.println("첫 번째 주사위가 나옵니다. " + dice1);
        System.out.println("두 번째 주사위가 나옵니다. " + dice2);
        System.out.println("총 주사위 값은 " + roll);

    }

}

