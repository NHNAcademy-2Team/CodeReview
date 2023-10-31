package chapter.three;

public class Dice {
    private int num;

    Dice() {
        reload();
    }

    public void reload() {
        num = (int) (6 * Math.random()) + 1;
    }

    public int getNum() {
        return num;
    }
}
