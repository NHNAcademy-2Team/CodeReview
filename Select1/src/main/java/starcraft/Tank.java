package starcraft;

public class Tank extends Terran implements Unflyable {
    public Tank() {
        this.attackPower = 7;
        this.defensivePower = 15;
        this.name = "Tank";
    }
    @Override
    public void attack(Unflyable unflyable) {
        Unit unit = (Unit)unflyable;
        if(unit == null)
            throw new IllegalArgumentException("Unit == null");
        unit.setDefensivePower(getDefensivePower() - this.attackPower);
    }
}
