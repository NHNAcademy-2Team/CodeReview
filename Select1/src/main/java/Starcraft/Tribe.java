package Starcraft;

public class Tribe {

    private static int fly = (int) Math.random() * 3;
    private static int cantFly = (int) Math.random() * 2 + 3;

    private Terran terran;
    private Protos protos;
    private Zerg zerg;

    public Tribe(String tribe) {
        switch (tribe) {
            case "Teran":
                this.terran = new Terran();
                settingTerran();
                break;
            case "Protos":
                this.protos = new Protos();
                settingProtos();
                break;
            case "Zerg":
                this.zerg = new Zerg();
                settingZerg();
                break;
        }
    }

    public void settingTerran() {
//        Terran terran = new Terran();
        Terran[] terrans = new Terran[5];
        terrans[0] = new Terran("Marine", 3, 10, false);
        terrans[1] = new Terran("Tank", 7, 15, false);
        terrans[2] = new Terran("Goliath", 5, 15, false, "미사일");
        terrans[3] = new Terran("Wraith", 3, 10, true);
        terrans[4] = new Terran("Valkyrie", 4, 12, true);

        for (int i = 0; i < 2; i++) {
            this.terran.setUnits(terrans[fly]);
        }
        for (int i = 0; i < 3; i++) {
            this.terran.setUnits(terrans[cantFly]);
        }
    }

    public void settingProtos() {
//        Protos protos = new Protos();
        Protos[] protoses = new Protos[5];
        protoses[0] = new Protos("Zealot", 5, 20, false);
        protoses[1] = new Protos("Dragoon", 3, 15, false, "레이저");
        protoses[2] = new Protos("HighTempler", 10, 2, false);
        protoses[3] = new Protos("Scount", 5, 10, true);
        protoses[4] = new Protos("Corsair", 4, 12, true);

        for (int i = 0; i < 2; i++) {
            this.protos.setUnits(protoses[fly]);
        }
        for (int i = 0; i < 3; i++) {
            this.protos.setUnits(protoses[cantFly]);
        }
    }

    public void settingZerg() {
//        Zerg zerg = new Zerg();
        Zerg[] zergs = new Zerg[5];
        zergs[0] = new Zerg("Zealot", 5, 20, false);
        zergs[1] = new Zerg("Dragoon", 3, 15, false, "레이저");
        zergs[2] = new Zerg("HighTempler", 10, 2, false);
        zergs[3] = new Zerg("Scount", 5, 10, true);
        zergs[4] = new Zerg("Corsair", 4, 12, true);

        for (int i = 0; i < 2; i++) {
            this.zerg.setUnits(zergs[fly]);
        }
        for (int i = 0; i < 3; i++) {
            this.zerg.setUnits(zergs[cantFly]);
        }
    }

}
