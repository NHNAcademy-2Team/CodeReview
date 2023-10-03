package starcraft;

public class HighTempler extends Protos implements Unflyable {
    public HighTempler() {
        this.attackPower = 10;
        this.defensivePower = 2;
        this.name = "HighTempler";
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
