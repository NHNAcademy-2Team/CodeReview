package starcraft;

import java.util.ArrayList;
import java.util.Random;

public class Tribe {
    String name;
    public ArrayList<Unit> units;

    public Tribe(String name){
        this.name = name;
        this.units = new ArrayList<>();
    }

    private void initializeUnits(int numberOfUnits){
        switch (name){
            case "Terran":
                for (int i = 1; i <= numberOfUnits; i++) {
                    units.add(new Unit("Marine", 3, 10,false,false));
                    units.add(new Unit("Tank", 7, 15,false,false));
                    units.add(new Unit("Goliath", 5, 15,false,true));
                    units.add(new Unit("Wraith", 3, 10,true,false));
                    units.add(new Unit("Valkyrie", 4, 12,true,false));
                }
                break;
            case "Protos":
                for (int i = 1; i <= numberOfUnits ; i++) {
                    units.add(new Unit("Zealot", 5, 20, false,false));
                    units.add(new Unit("Dragoon", 3, 15, false,true));
                    units.add(new Unit("HighTempler", 10, 2, false,false));
                    units.add(new Unit("Scout", 5, 10, true,false));
                    units.add(new Unit("Corsair", 4, 12, true,false));
                }
                break;
            case "Zerg":
                for (int i = 1; i <= numberOfUnits ; i++) {
                    units.add(new Unit("Zergling",2,2,false,false));
                    units.add(new Unit("Hydralisk",3,7,false,true));
                    units.add(new Unit("Ultralisk",5,15,false,false));
                    units.add(new Unit("Mutalisk",2,8,true,false));
                    units.add(new Unit("Guardian",3,6,true,false));
                }
                break;
            default:
                break;
        }
    }

    // 선택한 종족의 유닛을 랜덤 생성
    public void selectUnits(int numberOfUnits){
        initializeUnits(numberOfUnits);
    }

    public Unit getRandomUnit(){
        if(!units.isEmpty()){
            Random random = new Random();
            int randomIndex = random.nextInt(units.size());
            return units.remove(randomIndex);
        }
        return null;
    }

    public void displayRemainingUnits(){
        System.out.println(name);
        for (Unit unit: units){
            System.out.println(unit.name + " (현재 방어력: "+ unit.defense + ")");
        }
    }
}
