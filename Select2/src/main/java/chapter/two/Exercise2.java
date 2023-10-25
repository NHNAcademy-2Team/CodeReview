package chapter.two;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercise2 {
    public static void main(String[] args) {

        Dice dice1 = createDice(6);
        Dice dice2 = createDice(6);
        print(dice1, dice2);

    }

    public static Dice createDice(int maxNum) {
        Dice dice = new Dice(maxNum);
        dice.setRoll();
        return dice;
    }

    public static void print(Dice dice1, Dice dice2) {
        try {
            System.out.println("The first dice comes up " + dice1.getRoll());
            System.out.println("The second dice comes up " + dice2.getRoll());

            System.out.println("Your total roll is " + total(dice1.getRoll(), dice2.getRoll()));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static int total(int first, int second) {
        return first + second;
    }

}



