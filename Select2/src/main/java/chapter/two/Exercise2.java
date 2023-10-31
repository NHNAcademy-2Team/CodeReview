package chapter.two;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            diceSimulation();
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void diceSimulation() {
        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice(6);

        int rollNum1 = dice1.roll();
        int rollNum2 = dice2.roll();
        long total = Math.addExact(rollNum1, rollNum2);

        System.out.printf("The first die comes up %d%n", rollNum1);
        System.out.printf("The second die comes up %d%n", rollNum2);
        System.out.printf("Your total roll is %d%n", total);
    }
}
