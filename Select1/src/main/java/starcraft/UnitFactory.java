package starcraft;

import java.util.Random;

public class UnitFactory {
    private static final int terranNum = 5;
    private static final int protosNum = 4;
    private static final int zergNum = 5;
    private static Random random = new Random();

    public static Unit[] createUnit(int n) {
        switch (n) {
            case 1:
                return createTerran();
            case 2:
                return createProtos();
            case 3:
                return createZerg();
            default:
                throw new IllegalArgumentException("1, 2, 3 중에서 선택하지 않으셨습니다.");
        }
    }

    // TODO : 함수를 더 줄일 수 있을까 생각해보자
    private static Unit[] createTerran() {
        Unit[] terran = new Unit[terranNum];
        for (int i = 0; i < terranNum; i++) {
            Unit[] t = {new Marine(), new Tank(), new Goliath(), new Wraith(), new Valkyrie()};
            terran[i] = t[random.nextInt(t.length)];
        }
        return terran;
    }

    private static Unit[] createProtos() {
        Unit[] protos = new Unit[protosNum];
        for (int i = 0; i < protosNum; i++) {
            Unit[] p = {new Zealot(), new Dragoon(), new HighTempler(), new Scout(), new Corsair()};
            protos[i] = p[random.nextInt(p.length)];
        }
        return protos;
    }

    private static Unit[] createZerg() {
        Unit[] zerg = new Unit[zergNum];
        for (int i = 0; i < zergNum; i++) {
            Unit[] z = {new Zergling(), new Hydralisk(), new Ultralisk(), new Mutalisk(), new Guardian()};
            zerg[i] = z[random.nextInt(z.length)];
        }
        return zerg;
    }
}