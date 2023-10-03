package practice2;

public class Main {
    public static void main(String[] args) {

        Cellphone cellphone1 = new Cellphone("010-9999-1231", "jinyoung");
        cellphone1.send("Hello", new Cellphone("010-1234-5677", "taehee"));

        Cellphone cellphone2 = new Cellphone("010-1234-5677", "taehee");
//        cellphone2.receive(new Message());

    }
}
