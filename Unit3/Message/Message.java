package Message;

import java.util.Scanner;

public class Message {
    String receiver;
    String sender;
    MessageText message;
    
    public Message(Scanner s, String sender) {
        System.out.print("Who would you like to call? \n>>");
        this.receiver = s.nextLine();
        this.sender = sender;
    }

    public Message(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void printMessage() {
        System.out.println(message.getMessage());
    }
}
