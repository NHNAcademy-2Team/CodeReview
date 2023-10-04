package starcraft;

public abstract class Unit implements Flyable, Weaponable{
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

    public void attack(Unit targetunit){
        boolean flyOrWeaponUnit = this.isFly() || this.isWeapon();
        boolean notFlyUnitAndNotFlyTargetUnit = !this.isFly() && !targetunit.isFly();
        boolean isAttack = flyOrWeaponUnit || notFlyUnitAndNotFlyTargetUnit;
        if(isAttack) {
            targetunit.setDefensivePower(targetunit.getDefensivePower() - this.getAttackPower());
        }
    }

    @Override
    public boolean isFly(){
        return false;
    }

    @Override
    public boolean isWeapon(){
        return false;
    }
}
