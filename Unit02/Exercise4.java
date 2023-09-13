import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = input.length()-1;
        System.out.println(input.substring(0, 1).toUpperCase()+input.substring(1, n)+input.substring(n).toLowerCase());
    }
}
