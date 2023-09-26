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
        this.messages = new Message[3];

        String[] sender = {"James", "July", "Tom"};
        String[] senderNumber = {"010-1234-5678", "010-5432-11234", "010-3546-9434"};
        String[] messageText = {"OMG, what are you doing?", "I'm genius", "Hello"};

        for (int i = 0; i < 3; i++) {
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
        this.senderNumber = substractDash(senderNumber);
        this.messageText = change(messageText);
    }

    public String substractDash(String senderNumber) {
//        return senderNumber.replaceAll("-", "");

        int index = senderNumber.indexOf("-");
        StringBuilder sb = new StringBuilder();
        sb.append(senderNumber.substring(0, 3));    //010

        int index2 = senderNumber.indexOf("-", index + 1);

        sb.append(senderNumber.substring(index+1, index2));
        sb.append(senderNumber.substring(index2 + 1));

        return sb.toString();
    }

    public String change(String messageText) {
        String result = messageText;

        String[] replaceKey = {"R U", "OMG", "WTH"};
        String[] replaceValue = {"Are you", "Oh my god", "What the hell"};

        for(int i=0; i<replaceKey.length; i++) {
            if (messageText.contains(replaceKey[i])) {
                result = messageText.replace(replaceKey[i], replaceValue[i]);
            }
        }

        return result;
    }
}
