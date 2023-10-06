package starcraft;

public class Valkyrie extends Unit {
    public Valkyrie() {
        this.attackPower = 4;
        this.defensivePower = 12;
        this.brood = Brood.Terran;
        this.name = "Valkyrie";
    }

    @Override
    public boolean isFly() {
        return true;
    }
}
