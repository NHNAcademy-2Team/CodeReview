package unit.two;

public class Exercise1{
    public static void main(String[] args) {
        String name = new String("Suyeon");
        String first = name.substring(0, 1);
        String last = name.substring(name.length()-1);
        String result = first + " " + last;
        System.out.println(result);
    }
}
