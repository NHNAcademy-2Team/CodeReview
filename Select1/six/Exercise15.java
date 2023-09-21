package six;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Message message = new Message("taehee", "th915");

        String text = scanner.nextLine();
        message.setText(text);

        message.blank();
        System.out.println("sender : " + message.getSender() + "\nreceiver : " + message.getReceiver());
        System.out.println(message.getText());

        scanner.close();
    }
}
