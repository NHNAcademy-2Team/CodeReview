import java.util.ArrayList;

public class Player {
    public ArrayList<Unit> unitList = new ArrayList<>();
    private String race;

    public Player(int race, ArrayList<Unit> randomList) {
        this.race = raceName(race);
        this.unitList.addAll(randomList);
    }

    private String raceName(int race) {
        if (race == 1)
            return "terran";
        else if (race == 2)
            return "protos";
        else {
            return "zerg";
        }
    }

    public String getRace() {
        return race;
    }

    public void printUnitList() {
        for (int i = 0; i < unitList.size(); i++) {
            System.out.println(i + ". " + unitList.get(i).name + " (현재 방어력: " + unitList.get(i).defense + ")");
        }
    }
}
