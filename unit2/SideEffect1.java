package unit2;

public class SideEffect1 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("test");
        StringBuffer t;
        t = s;
        s.append("!");
        System.out.println(s.toString());
        System.out.println(t.toString());
    }
}
