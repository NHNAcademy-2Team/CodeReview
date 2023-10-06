package starcraft;

public class Guardian extends Unit {
    public Guardian() {
        this.attackPower = 3;
        this.defensivePower = 6;
        this.brood = Brood.ZERG;
        this.name = "Guardian";
    }

    @Override
    public boolean isFly() {
        return true;
    }
}
