package starcraft2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {

    private List user = new ArrayList<>();
    private Random rnd = new Random();
    private int size = rnd.nextInt(5);

    public Player(int choice) {
        settingUnit(choice);
    }

    public void settingUnit(int choice) {
        switch (choice) {
            case 1:
                Terran terran = new Terran();
                user.add("Terran");
                for (int i = 0; i < 5; i++) {
                    user.add(terran.getTerrans()[size]);
                }
                break;
            case 2:
                Protos protos = new Protos();
                user.add("Protos");
                for (int i = 0; i < 4; i++) {
                    user.add(protos.getProtoses()[size]);
                }
                break;
            case 3:
                Zerg zerg = new Zerg();
                user.add("Zerg");
                for (int i = 0; i < 8; i++) {
                    user.add(zerg.getZergs()[size]);
                }
                break;
            default:
                System.out.println("올바른 번호를 입력하십시오.");
                return;
        }
    }
}
