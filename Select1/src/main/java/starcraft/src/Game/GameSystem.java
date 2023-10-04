package Game;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import race.Unit;

public class GameSystem {

    private Player myUnit;
    private Player computerUnit;
    private Random random = new Random();
    private boolean myturn = true;

    public void createGame(Scanner scanner) {
        int number = 0;

        while (!(number >= 1 && number <= 3)) {
            try {
                System.out.print("종족을 선택하세요(terran(1), protos(2), zerg(3)) : ");
                number = scanner.nextInt();

                if (number < 1 || number > 3) {
                    throw new IllegalArgumentException("범위를 초과한 값입니다. 다시 입력해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 형식입니다. 정수를 입력해주세요.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        int randomNumber = random.nextInt(3) + 1;

        myUnit = new Player(number, unitSetting(number));
        computerUnit = new Player(randomNumber, unitSetting(randomNumber));

        fightRace(scanner);
    }

    private ArrayList<Unit> unitSetting(int number) {
        UnitSetting setting = new UnitSetting();

        if (number == 1) {
            return setting.terranRandomSetting();
        } else if (number == 2) {
            return setting.protosRandomSetting();
        } else {
            return setting.zergRandomSetting();
        }
    }

    private void fightRace(Scanner scanner) {
        int attackUnit = 0;
        int damageUnit = 0;

        printAll();
        while (myUnit.getUnitList().size() != 0 && computerUnit.getUnitList().size() != 0) {

            if (myturn) {
                try {
                    System.out.print("(Player) 공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요: ");
                    attackUnit = scanner.nextInt();
                    damageUnit = scanner.nextInt();

                    if (!checkAttackPossible(myUnit.getUnitList().get(attackUnit),
                            computerUnit.getUnitList().get(damageUnit))) {
                        throw new IllegalArgumentException("공격할 수 없습니다. 다시 선택해주세요.");
                    }
                    hitUnit(attackUnit, damageUnit);

                    myturn = false;
                    printAll();

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("인덱스 값을 초과하였습니다. 다시 입력해주세요.");
                }
            } else {
                System.out.print("(Computer) 공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요: ");
                attackUnit = random.nextInt(computerUnit.getUnitList().size());
                damageUnit = random.nextInt(myUnit.getUnitList().size());

                System.out.println(attackUnit + " " + damageUnit);
                hitUnit(attackUnit, damageUnit);

                myturn = true;
                printAll();
            }
        }
        winner();
    }

    private boolean checkAttackPossible(Unit attackUnit, Unit damageUnit) {
        return ((attackUnit.fly == false && attackUnit.ability.equals("")) && (damageUnit.fly == true)) ? false
                : true;
    }

    private void hitUnit(int attackUnit, int damageUnit) {
        int power = 0;
        int defense = 0;

        if (myturn) {
            power = myUnit.getUnitList().get(attackUnit).power;
            defense = computerUnit.getUnitList().get(damageUnit).defense;

            if (defense <= power)
                computerUnit.removeUnit(damageUnit);
            else {
                computerUnit.decreaseDefense(damageUnit, power);
            }
        } else {
            power = computerUnit.getUnitList().get(attackUnit).power;
            defense = myUnit.getUnitList().get(damageUnit).defense;

            if (defense <= power)
                myUnit.removeUnit(damageUnit);
            else {
                myUnit.decreaseDefense(damageUnit, power);
            }
        }
    }

    private void winner() {
        if (!myturn)
            System.out.println("Player가 승리했습니다!");
        else {
            System.out.println("computer가 승리했습니다!");
        }
    }

    public void printAll() {
        System.out.println("-------------------------------");
        System.out.println("적군: " + computerUnit.getRace());
        computerUnit.printUnitList();
        System.out.println("\n아군: " + myUnit.getRace());
        myUnit.printUnitList();
        System.out.println("-------------------------------\n");
    }
}
