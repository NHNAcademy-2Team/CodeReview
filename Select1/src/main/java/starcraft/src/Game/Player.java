package Game;

import java.util.ArrayList;

import race.Unit;

public class Player {
    private ArrayList<Unit> unitList = new ArrayList<>();
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

    public void removeUnit(int index) {
        unitList.remove(index);
    }

    public void decreaseDefense(int index, int power) {
        unitList.get(index).defense -= power;
    }

    public String getRace() {
        return race;
    }

    public ArrayList<Unit> getUnitList() {
        return unitList;
    }

    public void printUnitList() {
        for (int i = 0; i < unitList.size(); i++) {
            System.out.println(i + ". " + unitList.get(i).name + " (현재 방어력: " + unitList.get(i).defense + ")");
        }
    }
}
