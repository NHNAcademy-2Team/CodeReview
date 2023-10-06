package unit.two;

public class Exercise5 {
    public static void main(String[] args) {
        String input = "suyeon";
        StringBuffer sb = new StringBuffer(input);
        int n = input.length()-1;
        sb.replace(0, 1, input.substring(n));
        sb.replace(n, n+1, input.substring(0, 1));
        System.out.println(sb.toString());
    }
}