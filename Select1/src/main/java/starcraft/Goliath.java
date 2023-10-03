package starcraft;

public class Goliath extends Terran implements Unflyable, Weaponable {
    public Goliath() {
        this.attackPower = 5;
        this.defensivePower = 15;
        this.name = "Goliath";
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
