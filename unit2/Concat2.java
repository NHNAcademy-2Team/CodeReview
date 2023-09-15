package unit2;

public class Concat2 {
    public static void main(String[] args) {
        String first = "John";
        String middle = "Fitzgerald";
        String last = "Kennedy";

        System.out.println(first.substring(0, 1).concat(middle.substring(0, 1).concat(last.substring(0, 1))));
    }

}
