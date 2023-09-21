package unit.five;

public class Exercise1 {
    public static void alcoholTest(double content) {
        if (content > 40) {
            System.out.println("extra strong liquor");
        } else if (content > 20) {
            System.out.println("strong liquor");
        } else if (content > 15) {
            System.out.println("liquor");
        } else if (content > 12) {
            System.out.println("strong vine");
        } else if (content > 10.5) {
            System.out.println("normal vine");
        } else {
            System.out.println("light vine");
        }
    }

    public static void main(String[] args) {
        alcoholTest(13.4);
        alcoholTest(43);
        alcoholTest(23);
    }
}
