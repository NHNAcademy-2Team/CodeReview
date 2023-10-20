package com.nhnacademy;

public class Unit {
    private boolean fly;
    private boolean missile;
    private int offense;
    private int defense;

    public Unit(boolean fly, boolean missile, int offense, int defense) {
        this.fly = fly;
        this.missile = missile;
        this.offense = offense;
        this.defense = defense;
    }

    public boolean DefenseIsZero() {
        return defense == 0;
    }

    public int getOffense() {
        return this.offense;
    }

    public int getDefense() {
        return this.defense;
    }

    public void damaged(int enemyAttack) {
        this.defense -= enemyAttack;
    }

    public void attack(Unit enemyUnit) {
        enemyUnit.damaged(this.offense);
    }
}
