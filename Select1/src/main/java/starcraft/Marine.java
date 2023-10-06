package starcraft;

public class Marine extends Unit {
    public Marine() {
        this.attackPower = 3;
        this.defensivePower = 10;
        this.brood = Brood.TERRAN;
        this.name = "Marine";
    }
}
