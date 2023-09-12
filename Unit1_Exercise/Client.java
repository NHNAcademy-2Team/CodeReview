import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("찾으시는 분의 거주지와 이름을 입력하십시오.");
        System.out.print("지역 : ");
        String city = scan.nextLine();
        System.out.print("이름 : ");
        String name = scan.nextLine();

        
        Operator operator = new Operator();
        operator.setRegistry();
        System.out.println(operator.SearchTelephone(city, name));
    }
}

/* 
클라이언트 클래스
클라이언트는 원하는 사람의 전화번호를 얻기 위해서
특정 지역(city), 특정 이름(name)
을 스캐너로 입력받아서 교환원 객체에 전달해줌

교환원 객체는 실행과 setRegistr() 메소드를 통해 동시에 전화번호부 클래스에 사람들 리스트를 세팅함
SearchTelephone()에 도시명, 이름을 받아서 전화번호 출력함
*/