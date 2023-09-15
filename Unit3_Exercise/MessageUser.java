package Unit3_Exercise;

import java.util.Scanner;

public class MessageUser {

    public static void main(String[] args) {
        
        //Exercise 3.5
        //1. 발신자 번호 초기화
        String numberSender = "010-1234-5678";

        //2. 메시지의 텍스트와 코드를 읽고 MessageText 객체에 저장
        Scanner scan = new Scanner(System.in);
        System.out.print("보낼 메시지를 입력하세요 : ");
        String text = scan.nextLine();

        MessageText messageText = new MessageText(makeCode(text), text);
        // 왜 makeCode(text)가 주소값으로 들어가는지?? > 내가 MessageText 클래스 안에 toString()을 정의를 안해줘서!
        
        //3. 수신자 번호 입력
        System.out.print("받는이의 번호를 입력하세요 : ");
        String numberToCall = scan.nextLine();

        //4. Message 객체 생성
        Message message = new Message(messageText, numberToCall, numberSender);
        
        //5. Message 객체 정보 표시
        System.out.println(message.toString());
    }

    public static String makeCode(String message) {

        if (message.indexOf(" ") == -1) {
            return message;
        } else {
            String[] texts = message.split(" ");
            StringBuilder sb = new StringBuilder();
    
            for(String code : texts) {
                sb.append(code.substring(0, 1).toLowerCase());
            }
            return sb.toString();
        }
    }
}
