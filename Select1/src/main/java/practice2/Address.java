package practice2;

public class Address {

    private String name;
    private String phoneNumber;
    private String company;

    public Address(String name, String phonNnumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.company = "";
    }

    public Address(String name, String phoneNumber, String company) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.company = company;
    }

    public String toString() {
        return String.format("name : %s, phonenumber : %s, company : %s", this.name, this.phoneNumber, this.company);
    }
}
