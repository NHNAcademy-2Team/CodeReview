package Message;

import java.util.Scanner;

public class communication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sender = "010-1234-1234";
        String receiver = "";

        MessageText mt = new MessageText(s);

        System.out.print("Who would you like to call? \n>>");
        Message m = new Message(receiver, sender);
        m.printMessage();

        s.close();
    }
}
