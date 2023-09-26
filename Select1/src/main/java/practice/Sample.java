public class Sample {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        Message message = cellphone.messages[0];
        System.out.println(message.sender);
        System.out.println(message.senderNumber);
        System.out.println(message.messageText);
    }
}
