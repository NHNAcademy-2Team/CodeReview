package unit3;

public class Parameters {
    public static void changeValueS(String s) {
        s = s.concat("*");
    }

    public static void changeValueSB(StringBuffer sb) {
        sb.append("*");
    }

    public static void main(String[] args) {
        String a = "Hello";
        StringBuffer b = new StringBuffer("Ciao");

        System.out.println("String a = " + a);
        System.out.println("StringBuffer b = " + b);

        changeValueS(a);
        changeValueSB(b);

        System.out.println("String a = " + a);
        System.out.println("StringBuffer b = " + b);
    
    }
}
