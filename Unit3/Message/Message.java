package Message;
public class Message {
    String receiver;
    String sender;
    MessageText message;
    
    public Message(String receiver, String sender) {
        this.receiver = receiver;
        this.sender = sender;
    }

    public Message(String sender) {
        this.sender = sender;
    }

    public Message() {

    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void printMessage() {
        System.out.println(message.getMessage());
    }
}
