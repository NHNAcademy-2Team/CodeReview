package six;

public class Message {
    private String sender;
    private String receiver;
    private String text;

    public Message(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = "";
    }

    public void reMessage() {
        String x = this.sender;
        this.sender = this.receiver;
        this.receiver = x;
    }

    public void blank() {
        String message = "";
        char x = ' ';
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ')
                x = text.charAt(i);

            if (x != ' ') {
                x = text.charAt(i);
                message += x;
            }
        }
        text = message;
    }

    // public void rmVowles() {
    // // String message = "";
    // StringTokenizer st = new StringTokenizer(text);
    // String[] vowles = { "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" };

    // for(int i=0; i<vowles.length; i++){
    // st.
    // }
    // // for (int i = 0; i < text.length(); i++) {
    // // if (!checkVowles(text.charAt(i)))
    // // message += text.charAt(i);
    // // }
    // this.text = message;
    // }

    // public boolean checkVowles(char x) {
    // char[] arrays = { 'a', 'e', 'i', 'o', 'u' };
    // for (int i = 0; i < arrays.length; i++) {
    // if (x == arrays[i])
    // return true;
    // }
    // return false;
    // }

    public void blankAndVowle() {
        blank();
        // rmVowles();
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSender() {
        return this.sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public String getText() {
        return this.text;
    }
}
