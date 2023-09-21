package unit.five;

public class Exercise1 {
    public void exereise_1(long g) {
        if (40 < g) {
            System.out.println("extra strong liquor");
        }
        if (20 < g && g <= 40) {
            System.out.println("strong liquor");
        }
        if (15 < g && g <= 20) {
            System.out.println("liquor");
        }
        if (12 < g && g <= 15) {
            System.out.println("strong vine");
        }
        if (10.5 < g && g <= 12) {
            System.out.println("normal vine");
        }
        if (g <= 10.5) {
            System.out.println("light vine");
        }
    }
}
