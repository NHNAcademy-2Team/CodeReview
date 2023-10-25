package chapter.two;

public class Exercize2 {

    public static void main(String[] args) {
        int first;
        int second;

        first = Dice.rollDice();
        second = Dice.rollDice();

        System.out.println("The first die comes up " + first);
        System.out.println("The second die comes up " + second);
        System.out.printf("Your total roll is %d", (first + second));


        System.out.printf("""
                The first die comes up %d
                The second die comes up %d
                Your total roll is %d""", first, second, first + second);

    }
}

class Dice {
    public static int rollDice() {
        return (int) ((Math.random() * 6) + 1);
    }
}
