package starcraft;

public abstract class User {
    private Unit[] unit;

    protected User(Unit[] unit) {
        this.unit = unit;
    }

    public boolean isAllDelete() {
        for (int i = 0; i < unit.length; i++) {
            if (unit[i] != null) {
                return false;
            }
        }
        return true;
    }

    public void check() {
        for (int i = 0; i < unit.length; i++) {
            if (unit[i] != null && unit[i].getDefensivePower() <= 0) {
                unit[i] = null;
            }
        }
    }
}
