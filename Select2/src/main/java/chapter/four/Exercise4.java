package four;

public class Exercise4 {
    //Dice (class)
    //Dualdices (class)
    public static void main(String[] args) {
        Dualdices dices = new Dualdices();

        int[] count = new int[11];

        for (int i = 0 ; i < 10000 ; i++) {
            int num = dices.getSumDice();
            count[num - 2]++;
            dices.shuffle();
        }

        System.out.println("Total On Dice       Average Number of Rolls");
        System.out.println("-------------       -----------------------");
        for (int i = 0 ; i < count.length ; i++) {
            System.out.println("      " + (i+2) + "      " + "\t\t" + "    " + ((double)count[i]/(10000/100)) + "");
        }

    }
}
