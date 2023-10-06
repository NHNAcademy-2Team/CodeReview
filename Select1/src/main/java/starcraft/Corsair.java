package starcraft;

public class Corsair extends Unit {
    public Corsair() {
        this.attackPower = 4;
        this.defensivePower = 12;
        this.brood = Brood.Protos;
        this.name = "Corsair";
    }

    @Override
    public boolean isFly() {
        return true;
    }
}
