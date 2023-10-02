import java.util.ArrayList;

public class Zerg {

    private final ArrayList<Unit> zerg = new ArrayList<>();

    public Zerg() {
        zerg.add(new Unit(true, "Mutalisk", 2, 8, ""));
        zerg.add(new Unit(true, "Guardian", 3, 6, ""));
        zerg.add(new Unit(false, "Zergling", 2, 2, ""));
        zerg.add(new Unit(false, "Hydralisk", 3, 7, "stinger"));
        zerg.add(new Unit(false, "Ultralisk", 5, 15, ""));
        zerg.add(new Unit(true, "Queen", 15, 25, ""));
    }

    public ArrayList<Unit> getZergList() {
        return zerg;
    }
}
