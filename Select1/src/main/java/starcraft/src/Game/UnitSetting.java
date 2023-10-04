package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import race.*;
import race.protos.*;
import race.terran.*;
import race.zerg.*;

public class UnitSetting {

    private Random random = new Random();

    private List<Unit> terran = new ArrayList<>();
    private List<Unit> protos = new ArrayList<>();
    private List<Unit> zerg = new ArrayList<>();

    public UnitSetting() {
        terran.add(new Goliath());
        terran.add(new Marine());
        terran.add(new Tank());
        terran.add(new Valkyrie());
        terran.add(new Wraith());
        terran.add(new BattleCruzer());

        protos.add(new Corsair());
        protos.add(new Dragoon());
        protos.add(new HighTempler());
        protos.add(new Scout());
        protos.add(new Zealot());
        protos.add(new Carrier());

        zerg.add(new Guardian());
        zerg.add(new Hydralisk());
        zerg.add(new Mutalisk());
        zerg.add(new Ultralisk());
        zerg.add(new Zergling());
        zerg.add(new Queen());
    }

    public ArrayList<Unit> terranRandomSetting() {

        ArrayList<Unit> arrays = new ArrayList<>();
        arrays.add(new Unit(essentialUnit(terran)));
        for (int i = 0; i < 4; i++) {
            arrays.add(new Unit(terran.get(random.nextInt(terran.size()))));
        }
        return arrays;
    }

    public ArrayList<Unit> protosRandomSetting() {
        ArrayList<Unit> arrays = new ArrayList<>();

        arrays.add(new Unit(essentialUnit(protos)));
        for (int i = 0; i < 3; i++) {
            arrays.add(new Unit(protos.get(random.nextInt(protos.size()))));
        }
        return arrays;
    }

    public ArrayList<Unit> zergRandomSetting() {
        ArrayList<Unit> arrays = new ArrayList<>();

        arrays.add(new Unit(essentialUnit(zerg)));
        for (int i = 0; i < 7; i++) {
            arrays.add(new Unit(zerg.get(random.nextInt(zerg.size()))));
        }
        return arrays;
    }

    private Unit essentialUnit(List<Unit> unitList) {
        Unit temp;
        while (true) {
            temp = unitList.get(random.nextInt(unitList.size()));
            if (temp.fly == true || !(temp.ability.equals("")))
                break;
        }
        return temp;
    }

}
