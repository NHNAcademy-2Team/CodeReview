package Starcraft;

import java.util.List;

public class Protos extends Unit{

    public Protos() {
        super();
    }

    public Protos(String name, int attack, int sheild, boolean fly) {
        super(name, attack, sheild, fly);
    }

    public Protos(String name, int attack, int sheild, boolean fly, String weapon) {
        super(name, attack, sheild, fly, weapon);
    }

    @Override
    public void setUnits(Unit unit) {
        super.setUnits(unit);
    }

    @Override
    public List<Unit> getUnits() {
        return super.getUnits();
    }

    @Override
    public int getAttackPoint() {
        return super.getAttackPoint();
    }

    @Override
    public void getAttack(Unit user, Unit enemy) {
        super.getAttack(user, enemy);
    }

    @Override
    public int getSheild() {
        return super.getSheild();
    }

    @Override
    public boolean alive(String unit) {
        return super.alive(unit);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
