package PhoneMessage;

import java.util.Scanner;

public class SendMessage {
    public static void send(String[] args) {
        Scanner sc = new Scanner(System.in);

        String callPhoneNumber = "";
        System.out.print("code, message를 입력해주세요. 입력 형식) code message : Define (and use) an auxiliary static method for reading a phone number from the keyboard. Solve the exercise so as to use all methods that have been defined in the classes MessageText and Message (possibly by creating and printing various messages).");
        String code = sc.next();
        String m = sc.next();
        MessageText messageText = new MessageText(code, m);

        System.out.print("수신자의 전화번호를 입력해주세요 : ");
        String receiver = sc.next();

        Message message = new Message(messageText, callPhoneNumber, receiver);
        System.out.println(message.toString());

        sc.close();
    }
}
