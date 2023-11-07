package four;

public class Dice { //use Exercise3, Exercise4

    int num;

    Dice() {
        reload();
    }

    public void reload() {
        num = (int)(Math.random()*6) + 1;
    }

    public int getNum() {
        return num;
    }

    public int Num(int a, int b) {
        num = a+b;

        return num;
    }
}
