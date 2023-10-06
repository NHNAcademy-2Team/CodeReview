package starcraft;

public class Goliath extends Unit {
    public Goliath() {
        this.attackPower = 5;
        this.defensivePower = 15;
        this.brood = Brood.TERRAN;
        this.name = "Goliath";
    }

    @Override
    public boolean isWeapon() {
        return true;
    }
}
