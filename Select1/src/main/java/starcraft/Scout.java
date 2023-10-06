package starcraft;

public class Scout extends Unit {
    public Scout() {
        this.attackPower = 5;
        this.defensivePower = 10;
        this.brood = Brood.PROTOS;
        this.name = "Scout";
    }

    @Override
    public boolean isFly() {
        return true;
    }
}
