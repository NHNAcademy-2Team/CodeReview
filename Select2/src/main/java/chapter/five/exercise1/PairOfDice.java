package chapter.five.exercise1;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PairOfDice {
    private int dice1;
    private int dice2;

    public PairOfDice() {
        roll();
    }

    public PairOfDice(int val1, int val2) {
        dice1 = val1;
        dice2 = val2;
    }

    public void roll() {
        dice1 = (int) (Math.random() * 6) + 1;
        dice2 = (int) (Math.random() * 6) + 1;
    }

}