package chapter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercise2 {
    public static void main(String[] args) {

        int first = roll();
        int second = roll();
        int total = first + second;

        System.out.println("The first die comes up " + first);
        System.out.println("The second die comes up " + second);
        System.out.println("Your total roll is " + total);

    }

    public static int roll() {
        int dice = (int)(Math.random() * 6) + 1;
        return dice;
    }
}

