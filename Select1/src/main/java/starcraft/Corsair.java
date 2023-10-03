package starcraft;

public class Corsair extends Protos implements Flyable {

    public Corsair() {
        this.attackPower = 4;
        this.defensivePower = 12;
        this.name = "Corsair";
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
