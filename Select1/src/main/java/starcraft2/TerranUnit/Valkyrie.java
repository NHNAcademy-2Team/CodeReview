package starcraft2.TerranUnit;

import starcraft2.Flyable;
import starcraft2.Terran;
import starcraft2.Unit;

public class Valkyrie extends Terran implements Unit, Flyable {

    private final String NAME = "Valkyrie";
    private final int ATTACK = 4;
    private int sheild = 12;

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
