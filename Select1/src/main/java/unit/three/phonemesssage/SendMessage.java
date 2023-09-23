package unit.three.phonemesssage;

import java.util.Scanner;

public class SendMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String callPhoneNumber = "";
        System.out.print("code, message를 입력해주세요. 입력 형식 ) code message");
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