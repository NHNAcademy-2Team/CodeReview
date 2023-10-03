package Starcraft;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("===게임을 시작합니다!===");
        System.out.print("다음 중 종족을 골라주세요(Terran, Protos, Zerg) : ");
        String tribe = scan.nextLine();

        String[] tribes = {"Terran", "Protos", "Zerg"};
        String computer = tribes[rnd.nextInt(3)].toString();
        System.out.print("상대편의 종족은 " + computer + "입니다.");

        Tribe user = new Tribe(tribe);
        Tribe enemy = new Tribe(computer);

        System.out.println("아군 : " + );
        System.out.println("적군 : ");

        while(true) {
            System.out.println("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하십시오");
            System.out.print("아군 유닛 : ");
            System.out.print("적군 유닛 : ");
            String myUnit = scan.nextLine();
            String enemyUnit = scan.nextLine();
        }




    }
}
