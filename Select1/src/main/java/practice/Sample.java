package practice;

public class Sample {

    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        Message message = cellphone.messages[0];
        System.out.println(message.sender);
        System.out.println(message.senderNumber);
        System.out.println(message.messageText);
    }
}

class Cellphone {

    public Message[] messages;

    public Cellphone() {    //생성자에 메소드 호출하는게 더 좋음
        this.messages = message();
    }

    public Message[] message() {

        this.messages = new Message[5];

        String[] sender = {"James", "July", "Tom", "Smith", "Sam"};
        String[] senderNumber = {"010-1234-5678", "010-5432-11234", "010-3546-9434", "010-2342-2534", "010-3493-0439"};
        String[] messageText = {"It's so difficult", "I'm genius", "What do you do for fun", "Hello", "Let's go home!"};

        for (int i=0; i<5; i++) {
            this.messages[i] = new Message(sender[i], senderNumber[i], messageText[i]);
        }
        return messages;
    }
}

class Message {

    public String sender;
    public String senderNumber;
    public String messageText;

    public Message(String sender, String senderNumber, String messageText) {
        this.sender = sender;
        this.senderNumber = senderNumber;
        this.messageText = messageText;
    }

}
