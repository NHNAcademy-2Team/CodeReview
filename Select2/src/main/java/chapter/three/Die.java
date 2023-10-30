package chapter.three;

public class Die {
    private int num;

    Die() {
        reload();
    }

    public void reload() {
        num = (int) (6 * Math.random()) + 1;
    }

    public int getNum() {
        return num;
    }
}
