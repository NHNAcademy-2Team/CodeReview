package chapter.five.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(countSum());
    }

    private static int countSum(){
        int count = 0;
        while(true){
            PairOfDice pairOfDice = new PairOfDice();
            count++;
            if (pairOfDice.getDice1() + pairOfDice.getDice2() == 2){
                break;
            }
        }
        return count;
    }
}
