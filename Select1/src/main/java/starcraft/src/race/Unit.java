package race;

public class Unit {
    public boolean fly;
    public String name;
    public int power;
    public int defense;
    public String ability;

    public Unit(Unit unit) {
        this.fly = unit.fly;
        this.name = unit.name;
        this.power = unit.power;
        this.defense = unit.defense;
        this.ability = unit.ability;
    }

    public Unit(boolean fly, String name, int power, int defense, String ability) {
        this.fly = fly;
        this.name = name;
        this.power = power;
        this.defense = defense;
        this.ability = ability;
    }
}
