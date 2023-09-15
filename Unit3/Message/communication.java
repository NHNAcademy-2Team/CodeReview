package Message;

import java.util.Scanner;

public class communication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sender = "010-1234-1234";

        MessageText mt = new MessageText(s);

        Message m = new Message(s, sender);
        m.printMessage();

        s.close();
    }
}
