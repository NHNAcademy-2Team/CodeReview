//package starcraft;
//
//import java.util.ArrayList;
//import java.util.Random;
//
//public class Protos {
//    private ArrayList<Unit> units;
//
//    public Protos() {
//        units = new ArrayList<>();
//        initializeProtosUnits();
//    }
//
//    private void initializeProtosUnits() {
//        units.add(new AirUnit("Scout", 5, 10));
//        units.add(new AirUnit("Corsair", 4, 12));
//
//        units.add(new GroundUnit("Zealot", 5, 20));
//        units.add(new GroundUnit("Dragoon", 3, 15));
//        units.add(new GroundUnit("HighTempler", 10, 2));
//    }
//
//    public Unit getRandomUnit(){
//        Random random = new Random();
//        int randomIndex = random.nextInt(units.size());
//        return units.get(randomIndex);
//    }
//
//}
