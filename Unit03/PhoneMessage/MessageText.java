package PhoneMessage;

public class MessageText {
    private String code;
    private String message;

    public MessageText(String code, String message){
        this.code = code;
        this.message = message;
    }

    public String getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }

    public String toString(){
        return this.message + " => " + this.code;
    }
}
