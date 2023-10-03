package starcraft;

public abstract class Unit {
    protected int attackPower;
    protected int defensivePower;
    protected String unitName;
    protected String name;

    public String toString() {
        return String.format("%s (현재 방어력: %d)", this.name, this.defensivePower);
    }

    public int getDefensivePower() {
        return this.defensivePower;
    }

    public void setDefensivePower(int defensivePower) {
        this.defensivePower = defensivePower;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public int getAttackPower() {
        return this.attackPower;
    }
}
