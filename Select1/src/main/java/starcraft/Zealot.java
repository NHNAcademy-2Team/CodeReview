package starcraft;

public class Zealot extends Protos implements Unflyable {
    public Zealot() {
        this.attackPower = 5;
        this.defensivePower = 20;
        this.name = "Zealot";
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
