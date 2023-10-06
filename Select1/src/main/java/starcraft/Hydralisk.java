package starcraft;

public class Hydralisk extends Unit {
    public Hydralisk() {
        this.attackPower = 3;
        this.defensivePower = 7;
        this.brood = Brood.Zerg;
        this.name = "Hydralist";
    }

    @Override
    public boolean isWeapon() {
        return true;
    }
}
