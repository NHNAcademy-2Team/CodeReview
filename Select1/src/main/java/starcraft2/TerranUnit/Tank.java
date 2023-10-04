package starcraft2.TerranUnit;

import starcraft2.Flyable;
import starcraft2.Terran;
import starcraft2.Unit;

public class Tank extends Terran implements Unit, Flyable {

    private final String NAME = "Tank";
    private final int ATTACK = 7;
    private int sheild = 15;

    @Override
    public boolean flyable() {
        return false;
    }

    @Override
    public boolean weapon() {
        return false;
    }

    @Override
    public boolean attackFly() {
        return false;
    }
}
