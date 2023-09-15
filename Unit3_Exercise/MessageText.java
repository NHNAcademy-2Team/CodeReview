package Unit3_Exercise;

import java.util.HashMap;
import java.util.Map;

public class MessageText {

    //Exercise 3.3
    private String code;    //ily
    private String text;    //I love you

    private Map<String, String> messageList = new HashMap<String, String>();

    public MessageText(String code, String text) {
        this.code = code;
        this.text = text;
        this.messageList.put(code, text);
    }

    public String getCode() {
        return this.code;
    }

    public String getText() {
        return this.text;
    }

    //변수명이 모호하다는 피드백 > setCode -> addCode
    public void addCode(String code, String text) {
        this.messageList.put(code, text);
    }

    public String codeToText(String code) {
        return this.messageList.get(code);
    }

    public String toString() {
        return String.format("%s : %s", this.code, this.text);
    }

    
}
