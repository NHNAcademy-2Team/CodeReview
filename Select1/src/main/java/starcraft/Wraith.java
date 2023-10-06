package starcraft;

public class Wraith extends Unit{
    public Wraith() {
        this.attackPower = 3;
        this.defensivePower = 10;
        this.brood = Brood.Terran;
        this.name = "Wraith";
    }

    @Override
    public boolean isFly() {
        return true;
    }
}
