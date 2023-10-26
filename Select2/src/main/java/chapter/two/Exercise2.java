package chapter.two;

public class Exercise2 {
    private static int dice = 1;

    public static void randomDice() { // 주사위를 굴리는 행위만
        dice = (int) (Math.random() * 6) + 1;
    }

    public static void sumDice(int firstDice, int secondDice) {
        System.out.println("주사위 총 합: " + (firstDice + secondDice));
    }

    public static void main(String[] args) {
        randomDice();
        System.out.println("첫 번째 주사위: " + dice);
        randomDice();
        System.out.println("두 번째 주사위: " + dice);
        sumDice(dice, dice);
    }

}


