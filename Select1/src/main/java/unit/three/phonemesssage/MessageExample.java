package unit.three.phonemesssage;

import java.util.Scanner;

public class MessageExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("code, message를 입력해주세요. 입력 형식) code message : ");
        String code = sc.next();
        String m = sc.next();
        MessageText messageText = new MessageText(code, m);

        System.out.print("수신자의 전화번호를 입력해주세요 : ");
        String receiver = sc.next();

        Message message = new Message(messageText, "010-1234-5678", receiver);
        System.out.println(message.toString());

        System.out.println("발신자 초기화");
        message = new Message(messageText, receiver);
        System.out.println(message.toString());

        System.out.print("code, message를 입력해주세요. 입력 형식) code message : ");
        code = sc.next();
        m = sc.next();
        messageText = new MessageText(code, m);
        System.out.println("발신자 수신자 값 없이 생성");
        Message message2 = new Message(messageText);
        System.out.println(message2.toString());

        System.out.println("전화번호 업데이트");
        message2.setCall("010-2345-6789");
        System.out.println(message2.toString());
    }
}

