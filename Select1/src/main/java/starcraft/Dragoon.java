package starcraft;

public class Dragoon extends Unit {
    public Dragoon() {
        this.attackPower = 3;
        this.defensivePower = 15;
        this.brood = Brood.PROTOS;
        this.name = "Dragoon";
    }

    @Override
    public boolean isWeapon() {
        return true;
    }
}
