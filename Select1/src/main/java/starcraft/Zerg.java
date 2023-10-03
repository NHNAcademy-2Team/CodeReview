//package starcraft;
//
//import java.util.ArrayList;
//import java.util.Random;
//
//public class Zerg {
//    private ArrayList<Unit> units;
//
//    public Zerg() {
//        units = new ArrayList<>();
//        initializeProtosUnits();
//    }
//
//    private void initializeProtosUnits() {
//        units.add(new AirUnit("Mutalisk", 2, 8));
//        units.add(new AirUnit("Guardian", 3, 6));
//
//        units.add(new GroundUnit("Zergling", 2, 2));
//        units.add(new GroundUnit("Hydralisk", 3, 7));
//        units.add(new GroundUnit("Ultralisk", 5, 15));
//    }
//
//    public Unit getRandomUnit() {
//        Random random = new Random();
//        int randomIndex = random.nextInt(units.size());
//        return units.get(randomIndex);
//    }
//}
