package unit2.unit2_exercise;

public class Ex_2_4 {
    public static void main(String[] args) {
        String s = "홍지원";
        StringBuffer sbuf = new StringBuffer(s);
        sbuf.replace(0, 1, s.substring(2, 3));
        sbuf.replace(2, 3, s.substring(0, 1));
        System.out.println(sbuf);
    }
}
