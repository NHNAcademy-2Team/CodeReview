package starcraft;

public class Hydralisk extends Zerg implements Unflyable, Weaponable {
    public Hydralisk() {
        this.attackPower = 3;
        this.defensivePower = 7;
        this.name = "Hydralist";
    }

    @Override
    public void attack(Flyable flyable) {
        Unit unit = (Unit) flyable;
        if (unit == null) {
            throw new IllegalArgumentException("Unit == null");
        }
        unit.setDefensivePower(getDefensivePower() - this.attackPower);
    }

    @Override
    public void attack(Unflyable unflyable) {
        Unit unit = (Unit) unflyable;
        if (unit == null) {
            throw new IllegalArgumentException("Unit == null");
        }
        unit.setDefensivePower(getDefensivePower() - this.attackPower);
    }
}
