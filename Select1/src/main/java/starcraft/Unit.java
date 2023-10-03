package starcraft;

public class Unit {
    public String name;
    int power;
    int defense;
    boolean isAirUnit;
    boolean canSpecialAttack;

    public Unit(String name, int power, int defense, boolean isAirUnit, boolean canSpecialAttack) {
        this.name = name;
        this.power = power;
        this.defense = defense;
        this.isAirUnit = isAirUnit;
        this.canSpecialAttack = canSpecialAttack;
    }

    public void attack(Unit target) {
        if (target.isAirUnit || this.canSpecialAttack) {
            int damage = power - target.defense;
            if (damage > 0) {
                target.defense -= defense;
                if (target.defense <= 0) {
                    System.out.println(target.name + " 파괴됨");
                }
            } else {
                System.out.println(target.name + " 방어에 실패함");
            }
        } else {
            System.out.println(this.name + "은 날 수 없는 유닛을 공격할 수 없음");
        }
    }
}