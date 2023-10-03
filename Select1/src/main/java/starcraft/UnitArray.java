package starcraft;

import java.util.Random;

public class UnitArray {
    public static Unit[] selectUnitArr(int n){
        switch (n){
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
    private static Terran[] createTerran(){
        Terran[] terrans = new Terran[Terran.unitNum];
        Random random = new Random();
        for(int i = 0; i < Terran.unitNum; i++){
            Terran[] t = {new Marine(), new Tank(), new Goliath(), new Wraith(), new Valkyrie()};
            terrans[i] = t[random.nextInt(t.length)];
        }
        return terrans;
    }
    private static Protos[] createProtos(){
        Protos[] protos = new Protos[Protos.unitNum];
        Random random = new Random();
        for(int i = 0; i < Protos.unitNum; i++){
            Protos[] p = {new Zealot(), new Dragoon(), new HighTempler(), new Scout(), new Corsair()};
            protos[i] = p[random.nextInt(p.length)];
        }
        return protos;
    }
    private static Zerg[] createZerg(){
        Zerg[] zergs = new Zerg[Zerg.unitNum];
        Random random = new Random();
        for(int i = 0; i < Zerg.unitNum; i++){
            Zerg[] z = {new Zergling(), new Hydralisk(), new Ultralisk(), new Mutalisk(), new Guardian()};
            zergs[i] = z[random.nextInt(z.length)];
        }
        return zergs;
    }
}
