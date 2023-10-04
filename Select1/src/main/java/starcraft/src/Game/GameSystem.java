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

            if (!checkAttakPossible(myUnit, computerUnit)) {
                System.out.println("이미 승패가 결정났습니다.");
                break;
            }

            if (myturn) {

                try {
                    System.out.print("(Player) 공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요: ");
                    attackUnit = scanner.nextInt();
                    damageUnit = scanner.nextInt();

                    if (!checkAttackRange(myUnit.getUnitList().get(attackUnit),
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

                try {
                    attackUnit = random.nextInt(computerUnit.getUnitList().size());
                    damageUnit = random.nextInt(myUnit.getUnitList().size());

                    if (!checkAttackRange(computerUnit.getUnitList().get(attackUnit),
                            myUnit.getUnitList().get(damageUnit))) {
                        throw new IllegalArgumentException();
                    }
                    System.out.print("(Computer) 공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요: ");
                    System.out.println(attackUnit + " " + damageUnit);
                    hitUnit(attackUnit, damageUnit);

                    myturn = true;
                    printAll();
                } catch (IllegalArgumentException e) {
                }
            }
        }
        winner();
    }

    private boolean checkAttakPossible(Player player1, Player player2) {
        boolean player1Possible = false;
        boolean player2Possible = false;

        for (int i = 0; i < player1.getUnitList().size(); i++) {
            if (player1.getUnitList().get(i).fly == true
                    || player1.getUnitList().get(i).ability.equals("") == false) {
                player1Possible = true;
            }
        }

        for (int i = 0; i < player2.getUnitList().size(); i++) {
            if (player2.getUnitList().get(i).fly == true
                    || player2.getUnitList().get(i).ability.equals("") == false) {
                player2Possible = true;
            }
        }

        return (player1Possible == true && player2Possible == false
                || player1Possible == false && player2Possible == true) ? false : true;
    }

    private boolean checkAttackRange(Unit attackUnit, Unit damageUnit) {
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
