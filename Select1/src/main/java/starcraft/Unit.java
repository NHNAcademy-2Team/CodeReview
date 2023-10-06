package starcraft;

public abstract class Unit implements Flyable, Weaponable {
    protected int attackPower;
    protected int defensivePower;
    protected Brood brood;
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

    public Brood getBrood() {
        return brood;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public void attack(Unit targetUnit) {
        if (isFlyOrIsWeapon() || isNotFlyUnitAndNotFlyTargetUnit(targetUnit)) {
            targetUnit.setDefensivePower(targetUnit.getDefensivePower() - this.getAttackPower());
        }
        System.out.println("공격할 수 없습니다.");
    }

    @Override
    public boolean isFly() {
        return false;
    }

    @Override
    public boolean isWeapon() {
        return false;
    }

    private boolean isFlyOrIsWeapon() {
        return this.isFly() || this.isWeapon();
    }

    private boolean isNotFlyUnitAndNotFlyTargetUnit(Unit targetUnit) {
        return !this.isFly() && !targetUnit.isFly();
    }
}
