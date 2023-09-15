package unit2;

public class Concat {
    public static void main(String[] args) {
        String first = "John";
        String middle = "Fitzgerald";
        String last = "Kennedy";
        String initials;
        String firstInit, middleInit, lastInit;
        firstInit = first.substring(0, 1);
        middleInit = middle.substring(0, 1);
        lastInit = last.substring(0, 1);
        initials = firstInit.concat(lastInit);
        System.out.println(initials);

    }

}
