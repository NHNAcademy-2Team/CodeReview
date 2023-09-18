// 04.4
public class Even {
    public static boolean even(long x) {
        return (x % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println("짝수입니까? : " + even(17));
    }
}