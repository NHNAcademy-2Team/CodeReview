package starcraft;

public class Marine extends Terran implements Unflyable {
    public Marine() {
        this.attackPower = 3;
        this.defensivePower = 10;
        this.name = "Marine";
    }

    @Override
    public void attack(Unflyable unflyable) {
        Unit unit = (Unit)unflyable;
        if(unit == null)
            throw new IllegalArgumentException("Unit == null");
        unit.setDefensivePower(getDefensivePower() - this.attackPower);
    }
}
