package Unit3_Exercise;

public class MessageText {

    //Exercise 3.3
    private String code;    //ily
    private String text;    //I love you

    public MessageText(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public String getCode() {
        return this.code;
    }

    public String getText() {
        return this.text;
    }

    public String toString() {
        return String.format("%s : %s", this.code, this.text);
    }

    
}
