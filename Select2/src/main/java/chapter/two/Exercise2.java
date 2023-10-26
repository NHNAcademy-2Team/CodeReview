package chapter.two;
public class Exercise2 {
    // 주사위 하나를 두번 굴려 두수에 합을 출력하시오.
    private static int dice = 1;
    public static void main(String[] args) {
        int sum = 0;

        rollTheDice();
        sum += dice;
        System.out.println("The first die comes up " + dice);

        rollTheDice();
        sum += dice;
        System.out.println("The second die comes up " + dice);

        System.out.println("Your total roll is " + sum);
    }

    private static void rollTheDice() {
        dice = (int)((Math.random() * 6) + 1);
    }
}
