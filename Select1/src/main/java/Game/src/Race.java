import java.util.ArrayList;
import java.util.Random;

public class Race {

    private Terran terran;
    private Protos protos;
    private Zerg zerg;
    private Random random = new Random();

    public Race() {
        terran = new Terran();
        protos = new Protos();
        zerg = new Zerg();
    }

    public ArrayList<Unit> terranRandomSetting() {
        ArrayList<Unit> arrays = new ArrayList<>();

        arrays.add(new Unit(essentialUnit(terran.getTerranList())));
        for (int i = 0; i < 4; i++) {
            arrays.add(new Unit(terran.getTerranList().get(random.nextInt(terran.getTerranList().size()))));
        }
        return arrays;
    }

    public ArrayList<Unit> protosRandomSetting() {
        ArrayList<Unit> arrays = new ArrayList<>();

        arrays.add(new Unit(essentialUnit(protos.getProtosList())));
        for (int i = 0; i < 3; i++) {
            arrays.add(new Unit(protos.getProtosList().get(random.nextInt(protos.getProtosList().size()))));
        }
        return arrays;
    }

    public ArrayList<Unit> zergRandomSetting() {
        ArrayList<Unit> arrays = new ArrayList<>();

        arrays.add(new Unit(essentialUnit(zerg.getZergList())));
        for (int i = 0; i < 7; i++) {
            arrays.add(new Unit(zerg.getZergList().get(random.nextInt(zerg.getZergList().size()))));
        }
        return arrays;
    }

    private Unit essentialUnit(ArrayList<Unit> unitList) {
        Unit temp;
        while (true) {
            temp = unitList.get(random.nextInt(unitList.size()));
            if (temp.fly == true || !(temp.ability.equals("")))
                break;
        }
        return temp;
    }
}