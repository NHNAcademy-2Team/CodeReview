import java.util.ArrayList;

public class Terran {

    private final ArrayList<Unit> terran = new ArrayList<>();

    public Terran() {
        terran.add(new Unit(true, "Wraith", 3, 10, ""));
        terran.add(new Unit(true, "Valkyrie", 4, 12, ""));
        terran.add(new Unit(false, "Marine", 3, 10, ""));
        terran.add(new Unit(false, "Tank", 7, 15, ""));
        terran.add(new Unit(false, "Goliath", 5, 15, "missile"));
        terran.add(new Unit(true, "BattleCruzer", 20, 30, ""));
    }

    public ArrayList<Unit> getTerranList() {
        return terran;
    }
}
