package starcraft;

public class Ultralisk extends Zerg implements Unflyable {
    public Ultralisk() {
        this.attackPower = 5;
        this.defensivePower = 15;
        this.name = "Ultralist";
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
