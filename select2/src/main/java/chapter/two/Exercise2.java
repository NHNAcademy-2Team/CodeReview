package chapter.two;

public class Exercise2 {
    public static void randomDice() {
        int firstDice;
        int secondDice;
        int roll;

        firstDice = (int) (Math.random() * 6) + 1;
        secondDice = (int) (Math.random() * 6) + 1;
        roll = firstDice + secondDice;

        System.out.println("첫 번째 주사위: " + firstDice);
        System.out.println("두 번째 주사위: " + secondDice);
        System.out.println("총 주사위 값은 " + roll);
    }

    public static void main(String[] args) {
        randomDice();
    }

}

