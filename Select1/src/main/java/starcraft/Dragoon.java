package starcraft;

public class Dragoon extends Protos implements Unflyable, Weaponable {
    public Dragoon() {
        this.attackPower = 3;
        this.defensivePower = 15;
        this.name = "Dragoon";
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
