import java.util.ArrayList;

public class Protos {

    private final ArrayList<Unit> protos = new ArrayList<>();

    public Protos() {
        protos.add(new Unit(true, "Scout", 5, 10, ""));
        protos.add(new Unit(true, "Corsair", 4, 12, ""));
        protos.add(new Unit(false, "Zealot", 5, 20, ""));
        protos.add(new Unit(false, "Dragoon", 3, 15, "laser"));
        protos.add(new Unit(false, "HighTempler", 10, 2, ""));
    }

    public ArrayList<Unit> getProtosList() {
        return protos;
    }
}
