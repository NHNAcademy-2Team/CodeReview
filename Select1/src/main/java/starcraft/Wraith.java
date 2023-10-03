package starcraft;

public class Wraith extends Terran implements Flyable {
    public Wraith() {
        this.attackPower = 3;
        this.defensivePower = 10;
        this.name = "Wraith";
    }
    @Override
    public void attack(Flyable flyable) {
        Unit unit = (Unit)flyable;
        if(unit == null)
            throw new IllegalArgumentException("Unit == null");
        unit.setDefensivePower(getDefensivePower() - this.attackPower);
    }

    @Override
    public void attack(Unflyable unflyable) {
        Unit unit = (Unit)unflyable;
        if(unit == null)
            throw new IllegalArgumentException("Unit == null");
        unit.setDefensivePower(getDefensivePower() - this.attackPower);
    }
}
