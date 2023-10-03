package starcraft;

public class Zergling extends Zerg implements Unflyable {
    public Zergling() {
        this.attackPower = 2;
        this.defensivePower = 2;
        this.name = "Zergling";
    }

    @Override
    public void attack(Unflyable unflyable) {
        Unit unit = (Unit)unflyable;
        if(unit == null)
            throw new IllegalArgumentException("Unit == null");
        unit.setDefensivePower(getDefensivePower() - this.attackPower);
    }
}
