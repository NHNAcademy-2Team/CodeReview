package unit3;

public class Mathod {
    public static String duplicate(String pf) {
        return pf + ", " + pf;
    }

    public static void main(String[] args) {
        String s;
        s = duplicate("pippo" + "&" + "topolino");
        System.out.println(s);
    }
}
