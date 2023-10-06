package starcraft;

public class Mutalisk extends Unit {
    public Mutalisk() {
        this.attackPower = 2;
        this.defensivePower = 8;
        this.brood = Brood.ZERG;
        this.name = "Mutalisk";
    }

    @Override
    public boolean isFly() {
        return true;
    }
}
