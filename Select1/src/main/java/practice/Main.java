package practice;

public class Main {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone("010-1234-5678");
        Cellphone cellphone2 = new Cellphone("010-2345-6789");
        Message message = new Message("Hi", "010-2345-6789");
        Address suyeon = new Address.Builder("Suyeon", "010-2345-6789").build();
        Address jin = new Address.Builder("Jin", "010-3456-1234").setCompany("Hive").build();
        System.out.println(suyeon);
        System.out.println(jin);
        cellphone.send(message, cellphone2);
        cellphone.receive(message);
        cellphone.readmessages();
    }
}
