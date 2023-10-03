package starcraft;

import java.util.Random;
import java.util.Scanner;

public class MyMain {
    private static void play() {
        System.out.print("1 - Terran, 2 - Protos, 3 - Zerg, 3가지 종족 중 하나를 선택해주세요 : ");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            User player = new User(UnitArray.selectUnitArr(n));
            User computer = new User(UnitArray.selectUnitArr(random.nextInt(2)+1));
            System.out.println("적군: " + computer.toString());
            System.out.println("아군: " + player.toString());
            winner(sc, player, computer);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }
    }
    private static void winner(Scanner sc, User player, User computer){
        while (true){
            if (player.win()) {
                System.out.println("패배했습니다!!");
                break;
            }
            if(computer.win()){
                System.out.println("승리했습니다!!");
                break;
            }
            System.out.print("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요. ");
            player.attack(sc.nextInt(), computer.getUnit(sc.nextInt()));
            computer.attack(computer.shuffle(), player.getUnit(player.shuffle()));
            player.check();
            computer.check();

            System.out.println("적군: " + computer.toString());
            System.out.println("아군: " + player.toString());
        }
    }
    public static void main(String[] args) {
        play();
    }
}
