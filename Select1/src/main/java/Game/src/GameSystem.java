import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GameSystem {

    private Player myRace;
    private Player computerRace;
    private Random random = new Random();
    private boolean turn = true;

    public void createRace(Scanner scanner) {
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

        myRace = new Player(number, randomSetting(number));
        computerRace = new Player(randomNumber, randomSetting(randomNumber));

        fightRace(scanner);
    }

    private ArrayList<Unit> randomSetting(int number) {
        ArrayList<Unit> arrays = new ArrayList<>();
        Race race = new Race();

        if (number == 1) {
            arrays.add(new Unit(essentialUnit(race.getTerran().getTerranList())));
            for (int i = 0; i < 4; i++) {
                arrays.add(new Unit(
                        race.getTerran().getTerranList().get(random.nextInt(race.getTerran().getTerranList().size()))));
            }
        } else if (number == 2) {
            arrays.add(new Unit(essentialUnit(race.getProtos().getProtosList())));
            for (int i = 0; i < 3; i++) {
                arrays.add(new Unit(
                        race.getProtos().getProtosList().get(random.nextInt(race.getProtos().getProtosList().size()))));
            }
        } else {
            arrays.add(new Unit(essentialUnit(race.getZerg().getZergList())));
            for (int i = 0; i < 7; i++) {
                arrays.add(new Unit(
                        race.getZerg().getZergList().get(random.nextInt(race.getZerg().getZergList().size()))));
            }
        }
        return arrays;
    }

    private Unit essentialUnit(ArrayList<Unit> unitList) {
        Unit temp;
        while (true) {
            temp = unitList.get(random.nextInt(unitList.size()));
            if (temp.fly == true || !(temp.ability.equals("")))
                break;
        }
        return temp;
    }

    private void fightRace(Scanner scanner) {
        int attackUnit = 0;
        int damageUnit = 0;

        printAll();
        while (myRace.unitList.size() != 0 && computerRace.unitList.size() != 0) {
            if (turn) {

                try {
                    System.out.print("(Player) 공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요: ");
                    attackUnit = scanner.nextInt();
                    damageUnit = scanner.nextInt();

                    if (!checkAttackPossible(myRace.unitList.get(attackUnit), computerRace.unitList.get(damageUnit))) {
                        throw new IllegalArgumentException("공격할 수 없습니다. 다시 선택해주세요.");
                    }
                    hitUnit(attackUnit, damageUnit);

                    turn = false;
                    printAll();

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("인덱스 값을 초과하였습니다. 다시 입력해주세요.");
                }

            } else {
                System.out.print("(Computer) 공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요: ");
                attackUnit = random.nextInt(computerRace.unitList.size());
                damageUnit = random.nextInt(myRace.unitList.size());

                System.out.println(attackUnit + " " + damageUnit);
                hitUnit(attackUnit, damageUnit);

                turn = true;
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
        if (turn) {
            if (computerRace.unitList.get(damageUnit).defense <= myRace.unitList.get(attackUnit).power)
                computerRace.unitList.remove(damageUnit);
            else {
                computerRace.unitList.get(damageUnit).defense -= myRace.unitList.get(attackUnit).power;
            }
        } else {
            if (myRace.unitList.get(damageUnit).defense <= computerRace.unitList.get(attackUnit).power)
                myRace.unitList.remove(damageUnit);
            else {
                myRace.unitList.get(damageUnit).defense -= computerRace.unitList.get(attackUnit).power;
            }
        }
    }

    private void winner() {
        if (!turn)
            System.out.println("Player가 승리했습니다!");
        else {
            System.out.println("computer가 승리했습니다!");
        }
    }

    public void printAll() {
        System.out.println("-------------------------------");
        System.out.println("적군: " + computerRace.getRace());
        computerRace.printUnitList();
        System.out.println("\n아군: " + myRace.getRace());
        myRace.printUnitList();
        System.out.println("-------------------------------\n");
    }

}