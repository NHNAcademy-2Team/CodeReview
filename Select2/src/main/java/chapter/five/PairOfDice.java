package chapter.five;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PairOfDice {

    private int dice1;    //첫 번째 주사위에 표시되는 숫자
    private int dice2;    //두 번째 주사위에 표시되는 숫자

    public PairOfDice() {
        roll();
        classInvariant();
    }

    public PairOfDice(int val1, int val2) {
        dice1 = val1;
        dice2 = val2;
        classInvariant();
    }

    public void roll() {
        //각각의 주사위가 1~6 사이의 무작위 숫자가 되도록 설정하여 주사위를 굴림
        dice1 = (int)(Math.random() * 6) + 1;
        dice2 = (int)(Math.random() * 6) + 1;
    }

    public void classInvariant() {
        if (this.dice1 + this.dice2 > 12) {
            throw new IllegalArgumentException("범위를 초과하였습니다.");
        } else if (this.dice1 <= 0 || this.dice2 <= 0) {
            throw new IllegalArgumentException("양수가 아닙니다.");
        }
    }

    public int sumDice() {
        return this.dice1 + this.dice2;
    }

} //클래스 PairOfDice 종료
