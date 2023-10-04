package starcraft;

import java.util.Random;
import java.util.Scanner;
import starcraft.Tribe;
import starcraft.Unit;

public class GameMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("종족을 선택하세요 (1: Terran, 2: Protos, 3: Zerg): ");
        int userChoice = scn.nextInt();

        // 사용자가 선택한 종족에 따라 해당 종족의 클래스 인스턴스 생성
        Tribe userTribe = null;
        switch (userChoice){
            case 1:
                userTribe = new Tribe("Terran");
                userTribe.selectUnits(5);
                break;
            case 2:
                userTribe = new Tribe("Protos");
                userTribe.selectUnits(4);
                break;
            case 3:
                userTribe = new Tribe("Zerg");
                userTribe.selectUnits(8);
                break;
            default:
                System.out.println("잘못된 선택임. 기본적으로 Terran 종족으로 하겠음");
                userTribe = new Tribe("Terran");
                userTribe.selectUnits(5);
                break;
        }

        // 컴퓨터는 랜덤으로 종족 선택
        Tribe computerTribe = getRandomTribe();

        System.out.println("게임 시작!");

        while(!userTribe.units.isEmpty() && !computerTribe.units.isEmpty()){
            // 사용자 턴
            System.out.println("사용자의 턴입니다.");
            System.out.print("아군: ");
            userTribe.displayRemainingUnits();
            Unit userAttacker = selectAttackerUnit(userTribe);
            Unit userTarget = selectTargetUnit(computerTribe);

            if (userAttacker != null && userTarget != null){
                userAttacker.attack(userTarget);
                computerTribe.displayRemainingUnits();
            }

            if (!computerTribe.units.isEmpty()){
                System.out.println("컴퓨터의 턴입니다.");
                System.out.print("적군: ");
                Unit computerAttacker = computerTribe.getRandomUnit();
                Unit computerTarget = selectTargetUnit(userTribe);

                if (computerAttacker != null && computerTarget != null){
                    computerAttacker.attack(computerTarget);
                    userTribe.displayRemainingUnits();
                }
            }
        }

        System.out.println("게임 종료!");
        if(userTribe.units.isEmpty()){
            System.out.println("컴퓨터 승리");
        } else {
            System.out.println("사용자 승리");
        }
    }

    public static Tribe getRandomTribe(){
        Random random = new Random();
        int randomIndex = random.nextInt(3);
        switch (randomIndex){
            case 0:
                Tribe terranTribe = new Tribe("Terran");
                terranTribe.selectUnits(5);
                return terranTribe;
            case 1:
                Tribe protosTribe = new Tribe("Protos");
                protosTribe.selectUnits(4);
                return protosTribe;
            case 2:
                Tribe zergTribe = new Tribe("Zerg");
                zergTribe.selectUnits(8);
                return zergTribe;
            default:
                Tribe defaultTribe = new Tribe("Terran");
                defaultTribe.selectUnits(5);
                return defaultTribe;
        }
    }

    //사용자에게 공격할 유닛 선택받기
    public static Unit selectAttackerUnit(Tribe tribe) {
        Scanner scn = new Scanner(System.in);
        System.out.print("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요:");
        String targetUnitName = scn.nextLine();

        for (Unit unit : tribe.units) {
            if (unit.name.equals(targetUnitName)) {
                return unit;
            }
        }
        System.out.println("유효하지 않은 유닛 이름이다.");
        return null;
    }
    public static Unit selectTargetUnit(Tribe tribe) {
        Scanner scn = new Scanner(System.in);
        System.out.print("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요:");
        String targetUnitName = scn.nextLine();

        for (Unit unit : tribe.units) {
            if (unit.name.equals(targetUnitName)) {
                return unit;
            }
        }
        System.out.println("유효하지 않은 유닛 이름이다.");
        return null;
    }
}