package practice;

import java.util.ArrayList;
import java.util.List;

public class Cellphone {
    private String phoneNumber;
    private List<Address> addressbook = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    public Cellphone(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void send(Message message, Cellphone cellphone){
        cellphone.receive(message);
    }

    public void receive(Message message){
        messages.add(message);
    }
    public void readmessages(){
        for(Message message : messages){
            System.out.println(message);
        }
    }
    public void readAddressbook(){
        for(Address address : addressbook){
            System.out.println(address);
        }
    }
}
