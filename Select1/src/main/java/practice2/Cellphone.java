package practice2;

import java.util.ArrayList;
import java.util.List;

public class Cellphone {
    private String phoneNumber;
    private String name;
    private List<Address> addressbook = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    public Cellphone() {

    }

    public Cellphone(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public Cellphone(String phoneNumber, String address, String message) {
        this.phoneNumber = phoneNumber;
        this.messages.add(new Message(message, phoneNumber));
    }

    public void send(String message, Cellphone cellphone) {    //내가 보내면 상대방이 받는 것
        cellphone.receive(new Message(message, this.phoneNumber));
        System.out.println("메세지 전송이 완료되었습니다.");
    }

    public void receive(Message message) { //상대방이 보낸 걸 내가 받음
        messages.add(message);
        System.out.println(message.getMessage());
    }

    public void setAddressbook(String name, String phoneNumber) {
        this.addressbook.add(new Address(name, phoneNumber));
    }

    public List<Message> readmessages() {
        return this.messages;
    }

    public List<Address> readAddressbook() {
        return this.addressbook;
    }
}
