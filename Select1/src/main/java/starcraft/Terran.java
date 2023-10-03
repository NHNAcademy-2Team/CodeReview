//package starcraft;
//
//
//import java.util.ArrayList;
//import java.util.Random;
//
//public class Terran{
//    private ArrayList<Unit> units;
//
//    public Terran(){
//        units = new ArrayList<>();
//        initializeTerranUnits();
//    }
//
//    private void initializeTerranUnits(){
//        units.add(new AirUnit("Wraith",3,7));
//        units.add(new AirUnit("Valkyrie",4,12));
//
//        units.add(new GroundUnit("Marine", 3, 7));
//        units.add(new GroundUnit("Tank",7, 15));
//        units.add(new GroundUnit("Goliath", 5, 15));
//    }
//
//    public Unit getRandomUnit(){
//        Random random = new Random();
//        int randomIndex = random.nextInt(units.size());
//        return units.get(randomIndex);
//    }
//
//    public ArrayList<Unit> getTerranUnits(){
//        return units;
//    }
//
//}
