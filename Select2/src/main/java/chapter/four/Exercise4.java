package chapter.four;

public class Exercise4 {

    private static Dice dice1 = new Dice(6);
    private static Dice dice2 = new Dice(6);

    public static void main(String[] args) {

        System.out.println("주사위의 총합     평균 굴림 횟수");
        System.out.println("----------     ----------");

        for(int i = 2; i<=12; i++) {
            System.out.printf("   %2d           %f\n", i, avg(i));
        }

    }

    public static double avg(int totalNum) {

        double score = 0.0;
        int totalScore;

        try {

            for (int i = 0; i < 10000; i++) {
                dice1.setDice();
                dice2.setDice();

                totalScore = dice1.getDiceNum() + dice2.getDiceNum();

                if (totalScore == totalNum) {
                    score++;
                }
            }

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return score / 10000;
    }


}
