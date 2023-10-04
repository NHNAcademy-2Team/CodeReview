package starcraft2.TerranUnit;

import starcraft2.Flyable;
import starcraft2.Terran;
import starcraft2.Unit;

public class Goliath extends Terran implements Unit, Flyable {

    private final String NAME = "Goliath";
    private final int ATTACK = 5;
    private int sheild = 15;


    @Override
    public boolean flyable() {
        return false;
    }

    @Override
    public boolean weapon() {
        return true;
    }

    @Override
    public boolean attackFly() {
        return true;
    }
}
