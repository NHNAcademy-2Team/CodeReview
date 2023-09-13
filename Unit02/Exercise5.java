import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder sb = new StringBuilder(input);
        int n = input.length()-1;
        sb.replace(0, 1, input.substring(0, 1).toUpperCase());
        sb.replace(n, n+1, input.substring(n).toLowerCase());
        System.out.println(sb.toString());
    }
}
