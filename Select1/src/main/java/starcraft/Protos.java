package starcraft;

import java.util.ArrayList;
import java.util.List;

public class Protos extends Unit{

    private String name;
    public int attack;
    private int sheild;
    private List<Unit> protoses = new ArrayList<>();
    private boolean attackFly;

    public Protos() {}

    public Protos(String name, int attack, int sheild, boolean fly) {
        this.name = name;
        this.attack = attack;
        this.sheild = sheild;
        this.attackFly = fly;
    }

    public Protos(String name, int attack, int sheild, boolean fly, String weapon) {
        this.name = name;
        this.attack = attack;
        this.sheild = sheild;
        this.attackFly = true;
    }

    public void setProtoses(Unit unit) {   //Unit 세팅
        this.protoses.add(unit);
    }

    public List<Unit> getProtoses() {  //Unit 리스트 출력
        return this.protoses;
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
            protoses.remove(unit);
            return false;
        }
        return true;
    }

    public String toString() {
        return name + " (현재 방어력 : " + this.sheild + ")";
    }
}
