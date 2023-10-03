package practice;

public class Cellphone {

    public Message[] messages;

    public Cellphone() {
        messages = new Message[3];

        messages[0] = new Message("jiwon", "010-2334-4556", "RY");
        messages[1] = new Message("boram", "010-4953-2345", "OMG");
        messages[2] = new Message("namhee", "010-3423-3422", "WTH");
    }


    public static String switchWord(String messageText) {
        if (messageText == "RY") {
            messageText = "are you";
        } else if (messageText == "OMG") {
            messageText = "oh my god";
        } else if (messageText == "WTH") {
            messageText = "what the hell";
        }

        return messageText;
    }



}
