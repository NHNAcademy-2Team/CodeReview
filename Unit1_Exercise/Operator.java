import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Operator {

    private String telephoneNumbers;
    private String personNames;
    private String city;
    private TelephoneRegistry telephoneRegistry = new TelephoneRegistry();

    // public Operator(String city, String personNames) {
    //     this.personNames = personNames;
    //     this.city = city;
    // }

    //전화번호부에 목록 입력
    public void setRegistry() {

        Random rnd = new Random();
        String[] first = {"김", "이", "박", "최", "정"};
        String[] name = {"아", "영", "진", "수", "연", "태", "희", "승", "현", "세", "인", "현", "석", "동", "훈"};
        int middle = rnd.nextInt(900) + 100;
        int last = rnd.nextInt(9000) + 1000;

        String personNames = "";
        String telephoneNumbers = "";

        telephoneRegistry.add(new Information("대전", "양진영", "042-123-4567"));

        for(int i=0; i<30; i++) {
            int random = rnd.nextInt(5);
            personNames = first[rnd.nextInt(5)] + name[rnd.nextInt(15)] + name[rnd.nextInt(15)];
            telephoneNumbers = Cities.values()[random].getNum() + "-" + middle + "-" + last;
            telephoneRegistry.add(new Information(Cities.values()[random].toString(), personNames, telephoneNumbers));
        }
        // System.out.println(telephoneRegistry.getTelephone().toString());
    }

    
    //입력한 도시와 이름으로 전화번호 찾기
    public String SearchTelephone(String city, String personName) {

        ArrayList<Information> cities = telephoneRegistry.getTelephone();
        boolean exist = false;
        String result = "";
        
        for(int i=0; i<cities.size(); i++) {
            if(city.equals(cities.get(i).getCity()) && personName.equals(cities.get(i).getPersonName())) {
                this.telephoneNumbers = cities.get(i).getTelephoneNum();
                exist = true;
            } 
        }

        result = (exist == true) ? "찾으시는 분의 전화번호는 " + this.telephoneNumbers + " 입니다." : "찾으시는 분의 전화번호는 존재하지 않습니다.";

        return result;
    }

}

    
/* 
교환원 클래스
교환원 객체는 실행과 setRegistry() 메소드를 통해 동시에 전화번호부 클래스에 사람들 리스트를 세팅함
도시명과 이름과 전화번호는 Random 클래스를 사용해 난수로 작성하고(지역 번호는 Cities enum에서 값을 무작위로 가져옴) City 클래스에 전달 후
그 값을 전화번호부 클래스에 List로 저장함(도시명과 지역 번호는 일치시키도록 함)

SearchTelephone()에 도시명, 이름을 받아서 전화번호 출력함
전화번호부 클래스에 저장된 리스트를 가져와서 저장 후 만일 전달받은 도시명과 이름이 해당 리스트에 있는 목록 중 일치하는게 있으면 전화번호를 가져옴
*/