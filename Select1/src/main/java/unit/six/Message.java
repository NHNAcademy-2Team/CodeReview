package unit.six;

import java.util.StringTokenizer;

public class Message {
    private String sender;
    private String receiver;
    private String text;

    public Message(String s, String r, String t) {
        this.sender = s;
        this.receiver = r;
        this.text = t;
    }


    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void rebuildMessage() {
        StringBuilder sb = new StringBuilder("");
        StringTokenizer st = new StringTokenizer(text);

        while (st.hasMoreTokens()) {
            sb.append(st.nextToken() + " ");
        }
        sb.deleteCharAt(sb.length() - 1);

        this.text = sb.toString();
    }

    public void deleteVowels() {
        StringBuilder sb = new StringBuilder(text);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i'
                    || sb.charAt(i) == 'o' || sb.charAt(i) == 'u') {
                sb.deleteCharAt(i);
                continue;
            }
        }
        text = sb.toString();
    }
}
