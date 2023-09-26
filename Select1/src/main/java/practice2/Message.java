package practice2;

public class Message {

    private String message;
    private String phoneNumber;

    public Message(String message, String phoneNumber) {
        this.message = message;
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        return String.format("message : %s, phoneNumber : %s", this.message, this.phoneNumber);
    }
}
