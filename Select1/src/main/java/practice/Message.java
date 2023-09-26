package practice;

public class Message {
    private String message;
    private String phoneNumber;

    public Message(String message, String phoneNumber){
        this.message = message;
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return this.message;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String toString(){
        return String.format("메시지 : %s, 핸드폰 번호 : %s", this.message, this.phoneNumber);
    }
}
