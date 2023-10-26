package chapter.three;

public class Exercise1 {
    private static int firstDice = 1;
    private static int secondDice = 1;

    public static void randomDice() { // 주사위를 굴리는 행위만
        int firstDice = (int) (Math.random() * 6) + 1;
        int secondDice = (int) (Math.random() * 6) + 1;
    }

    public static void countRoll(){
        int count = 0;
        do {
            randomDice();
        } while (!(firstDice = 1 && secondDice =1));
    }


    public static void main(String[] args) {
        randomDice();
        randomDice();

    }

}
