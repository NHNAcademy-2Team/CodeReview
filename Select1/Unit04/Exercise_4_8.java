package Select1.Unit04;

public class Exercise_4_8 {

    public static void main(String[] args) {

        //4.8 프로그램 실행 시 어떤 것이 출력됩니까?
        //Account
        int c = 100;
        Account r = new Account(100);
        method(c, r);
        System.out.println(c + " " + r.bal);  //100 200
        //c는 int값을 매개변수에서 복사하여 값을 변경했지만, method()가 종료되면 복사된 int 값이 사라지기 때문에 원래의 c값이 출력
        //r.bal은 객체 자체를 매개변수로 주어 참조변수 내의 데이터를 변경시켰기 때문에 변경된 값 출력

    }

    //4.8
    public static void method(int a, Account b) {
        a *= 2;
        b.bal *= 2;
    }
    
}
