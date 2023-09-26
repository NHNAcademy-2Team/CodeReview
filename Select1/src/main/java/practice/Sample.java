package practice;

public class Sample {

    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();


        for (int i = 0; i < cellphone.messages.length; i++) {
            Message message = cellphone.messages[i];
            System.out.println(message.sender);
            System.out.println(message.senderNumber.replaceAll("-", ""));
            System.out.println(Cellphone.switchWord(message.messageText));
            System.out.println();
        }


    }
}
