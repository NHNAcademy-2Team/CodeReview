package practice;

public class Cellphone {
    public Message[] messages;
    public Cellphone() {
        messages = new Message[5];
        String sender;
        String senderNumber;

        for(int i = 0; i<messages.length;i++) {
            sender = "User[" + i + "]";
            senderNumber = "1000" + i;
            messages[i] = new Message(sender, senderNumber, "Hello User[" + i + "]");
        }
    }
}
