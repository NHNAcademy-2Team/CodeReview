package starcraft;

public class Scout extends Protos implements Flyable {
    public Scout() {
        this.attackPower = 5;
        this.defensivePower = 10;
        this.name = "Scout";
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
