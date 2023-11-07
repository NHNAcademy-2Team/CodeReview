package chapter.four;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Total On Dice     Average Number of Rolls");
        System.out.println("-------------     -----------------------");

        for (int i = 2; i <= 12; i++) {
            System.out.println("\t" + i +"\t\t\t\t\t" + DiceRollStats.getAverageRollCount(i, 10000));
        }

    }
}

class DiceRollStats{
    public static double getAverageRollCount(int number, int count){
        double sum = 0.0;

        for (int i = 0; i < count; i++) {
            sum += RollFor2.rollFor(number);
        }
        return sum / count;
    }
}