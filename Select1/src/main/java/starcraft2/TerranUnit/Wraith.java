package starcraft2.TerranUnit;

import starcraft2.Flyable;
import starcraft2.Terran;
import starcraft2.Unit;

public class Wraith extends Terran implements Unit, Flyable {

    private final String NAME = "Wraith";
    private final int ATTACK = 3;
    private int sheild = 10;

    @Override
    public boolean flyable() {
        return true;
    }

    @Override
    public boolean weapon() {
        return false;
    }

    @Override
    public boolean attackFly() {
        return true;
    }
}
