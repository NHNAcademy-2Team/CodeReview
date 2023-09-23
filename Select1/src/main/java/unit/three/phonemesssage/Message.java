package unit.three.phonemesssage;

public class Message {
    private MessageText messageText;
    private String callPhoneNumber;
    private String senderPhoneNumber;

    public Message(MessageText messageText, String callPhoneNumber, String senderPhoneNumber){
        this.messageText = messageText;
        this.callPhoneNumber = callPhoneNumber;
        this.senderPhoneNumber = senderPhoneNumber;
    }

    public Message(MessageText messageText, String senderPhoneNumber){
        this.messageText = messageText;
        this.callPhoneNumber = null;
        this.senderPhoneNumber = senderPhoneNumber;
    }

    public Message(MessageText messageText){
        this.messageText = messageText;
        this.callPhoneNumber = null;
        this.senderPhoneNumber = null;
    }

    public void setCall(String senderPhoneNumber){
        this.senderPhoneNumber = senderPhoneNumber;
    }

    public String toString(){
        return "메시지 : " + this.messageText + ", 발신자 : " + this.callPhoneNumber + ", 수신자 : " + this.senderPhoneNumber;
    }
}