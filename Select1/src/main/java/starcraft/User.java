package starcraft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private Unit[] unit;

    public User(Unit[] unit) {
        this.unit = unit;
    }

    public void attack(int index, Unit another) {
        if (unit[index] == null) {
            throw new IllegalArgumentException("파괴된 아군을 선택하셨습니다.");
        }
        another.setDefensivePower(another.getDefensivePower() - unit[index].getAttackPower());
    }

    public Unit getUnit(int i) {
        if (unit[i] == null) {
            throw new IllegalArgumentException("파괴된 적군을 선택하셨습니다.");
        }
        return unit[i];
    }

    public Unit[] getUnitArr() {
        return this.unit;
    }

    public boolean win() {
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

    public int shuffle() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < unit.length; i++) {
            if (unit[i] != null) {
                list.add(i);
            }
        }
        Collections.shuffle(list);
        return list.get(0);
    }

    @Override
    public String toString() {
        if (unit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(unit.getClass().getSimpleName().replace("[]", "")).append("\n");
        for (int i = 0; i < unit.length; i++) {
            if (unit[i] != null) {
                sb.append(i).append(".").append(unit[i].toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
