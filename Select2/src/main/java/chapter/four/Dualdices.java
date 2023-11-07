package four;

public class Dualdices {    //use Exercise3, Exercise4
    private Dice dice1;
    private Dice dice2;

    Dualdices() {
        dice1 = new Dice();
        dice2 = new Dice();
    }
    Dualdices(Dice dice1, Dice dice2) {
        this.dice1 = dice1;
        this.dice2 = dice2;
    }

    public int getSumDice() {
        int num1 = dice1.getNum();
        int num2 = dice2.getNum();

        return num1 + num2;
    }

    public void shuffle() {
        dice1.reload();
        dice2.reload();
    }


}
