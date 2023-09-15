package Unit3_Exercise;

public class Message {

    //Exercise 3.4
    private String numberToCall;
    private String numberSender;
    private MessageText messageText;

    public Message(MessageText messageText, String numberToCall, String numberSender) {
        this.messageText = messageText;
        this.numberToCall = numberToCall;
        this.numberSender = numberSender;
    }

    public Message(MessageText messageText, String numberSender) {
        this.messageText = messageText;
        this.numberSender = numberSender;
    }

    public Message(MessageText messageText) {
        this.messageText = messageText;
    }

    public void setNumberToCall(String phoneNumber) {
        this.numberToCall = phoneNumber;
    }

    //a method that prints the message.
    public String getMessage() {
        return this.messageText.getText();
    }

    public String toString() {
        return String.format("'%s' To %s From %s", this.messageText, this.numberToCall, this.numberSender);
    }
    
}
