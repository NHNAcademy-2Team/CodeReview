package Starcraft;

import java.util.ArrayList;
import java.util.List;

public abstract class Unit {

    private String name;
    public int attack;
    private int sheild;
    private List<Unit> units = new ArrayList<>();
    private boolean attackFly;

    public Unit() {}

    public Unit(String name, int attack, int sheild, boolean fly) {
        this.name = name;
        this.attack = attack;
        this.sheild = sheild;
        this.attackFly = fly;
    }

    public Unit(String name, int attack, int sheild, boolean fly, String weapon) {
        this.name = name;
        this.attack = attack;
        this.sheild = sheild;
        this.attackFly = true;
    }

    public void setUnits(Unit unit) {   //Unit 세팅
        this.units.add(unit);
    }

    public List<Unit> getUnits() {  //Unit 리스트 출력
        return this.units;
    }

    public int getAttackPoint() {
        return this.attack;
    }

    public void getAttack(Unit user, Unit enemy) {   //공격 받기
        if (this.sheild != 0) {
            this.sheild -= enemy.attack;
        }
    }

    public int getSheild() {
        return this.sheild;
    }

    public boolean alive(String unit) {
        if (this.sheild == 0) {
            System.out.println(unit + "유닛이 파괴되었습니다.");
            units.remove(unit);
            return false;
        }
        return true;
    }

    public String toString() {
        return name + " (현재 방어력 : " + this.sheild + ")";
    }

}
