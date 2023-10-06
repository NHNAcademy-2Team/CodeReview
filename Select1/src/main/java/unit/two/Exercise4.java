package unit.two;

public class Exercise4 {
    public static void main(String[] args) {
        String input = "suyeon";
        int n = input.length()-1;
        String result = (input.substring(n) + input.substring(1, n) + input.substring(0, 1)) ;
        System.out.println(result);
    }
}