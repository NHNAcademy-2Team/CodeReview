// Exercise 03.4

public class Message extends MessageText {

    private String senderNum;
    private String recipientNum;

    public Message(MessageText message, String senderNum, String recipientNum) {
        super(message.getMessage());
        this.senderNum = senderNum;
        this.recipientNum = recipientNum;
    }

    public Message(String message, String senderNum) {
        super(message);
        this.senderNum = senderNum;
        this.recipientNum = null;
    }

    public Message(String message) {
        super(message);
        this.senderNum = null;
        this.recipientNum = null;
    }

    public void setRecipientNum(String recipientNum) {
        this.recipientNum = recipientNum;
    }

    public void printMessage() {
        System.out.println("발신 번호 : " + this.senderNum + "\n수신 번호 : " + this.recipientNum + "\n메시지 : " + getMessage());
    }
}
