package unit.six;

import java.util.StringTokenizer;

// 6_15
public class Message {
    private String sender;
    private String receiver;
    private String text;
    public Message(String sender, String receiver, String text){
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }
    public String getSender(){
        return this.sender;
    }
    public String getReceiver(){
        return this.receiver;
    }
    public String getText(){
        return this.text;
    }
    public void setSender(String sender){
        this.sender = sender;
    }
    public void setReceiver(String receiver){
        this.receiver = receiver;
    }
    public void setText(String text){
        this.text = text;
    }
    public void change(){
        String temp = this.receiver;
        this.receiver = this.sender;
        this.sender = temp;
    }
    public String swappingSpace(String text){
        String result = "";
        StringTokenizer st = new StringTokenizer(text);
        while(st.countTokens() > 1){
            result += st.nextToken() + " ";
        }
        result += st.nextToken();
        return result;
    }
    public String swappingVowels(String text){
        String result = "";
        StringTokenizer st = new StringTokenizer(text, "aioeuy");
        while(st.hasMoreTokens()){
            result += st.nextToken();
        }
        return result;
    }
    public String swapping(String text){
        String t = swappingVowels(text);
        String result = swappingSpace(t);
        return result;
    }
}
