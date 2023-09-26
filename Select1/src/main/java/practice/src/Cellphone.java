import java.util.ArrayList;

public class Cellphone {

    private String myName;
    private String phoneNumber;
    private ArrayList<Address> addressbook = new ArrayList<>();
    private ArrayList<Message> messages = new ArrayList<>();

    public Cellphone(String myName, String phoneNumber) {
        this.myName = myName;
        this.phoneNumber = phoneNumber;
    }

    public void setAddressbook(String name, String phonenumber, String company) {
        addressbook.add(new Address(name, phonenumber, company));
    }

    public void send(String message, Cellphone cellphone) {
        messages.add(new Message(message, cellphone.getPhoneNumber()));
    }

    public void receive(Cellphone cellphone) {
        System.out.println("sender > " + cellphone.getMyName());

        for (Address i : cellphone.readAddressBook()) {
            if (i.getPhonenumber().equals(this.getPhoneNumber())) {
                System.out.println("receiver > " + i.toString());
            }
        }
        for (Message j : cellphone.readMessages()) {
            if (j.getPhoneNumber().equals(this.getPhoneNumber())) {
                System.out.println("message : " + j.getMessage() + "\n");
            }
        }
    }

    public ArrayList<Address> readAddressBook() {
        return addressbook;
    }

    public ArrayList<Message> readMessages() {
        return messages;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMyName() {
        return myName;
    }
}
