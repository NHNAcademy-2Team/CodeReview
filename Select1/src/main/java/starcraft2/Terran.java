package starcraft2;

import starcraft2.TerranUnit.Goliath;
import starcraft2.TerranUnit.Marine;
import starcraft2.TerranUnit.Tank;
import starcraft2.TerranUnit.Valkyrie;
import starcraft2.TerranUnit.Wraith;
import java.util.Random;

public class Terran{

    private Unit[] list = new Unit[5];
    private Random rnd = new Random();


    public Unit[] getTerrans() {
        list[0] = new Marine();
        list[1] = new Tank();
        list[2] = new Goliath();
        list[3] = new Wraith();
        list[4] = new Valkyrie();

        return list;
    }

}
