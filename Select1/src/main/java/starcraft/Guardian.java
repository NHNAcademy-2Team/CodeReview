package starcraft;

public class Guardian extends Zerg implements Flyable {
    public Guardian() {
        this.attackPower = 3;
        this.defensivePower = 6;
        this.name = "Guardian";
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
