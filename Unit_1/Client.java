import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.next();
        String name = scanner.next();

        Operator op = new Operator(city, name);
        System.out.println(op.findPhoneNumber());

        scanner.close();
    }
}