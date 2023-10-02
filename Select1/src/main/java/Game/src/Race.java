public class Race {

    private Terran terran;
    private Protos protos;
    private Zerg zerg;

    public Race() {
        terran = new Terran();
        protos = new Protos();
        zerg = new Zerg();
    }

    public Terran getTerran() {
        return terran;
    }

    public Protos getProtos() {
        return protos;
    }

    public Zerg getZerg() {
        return zerg;
    }
}