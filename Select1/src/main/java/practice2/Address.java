package practice2;

public class Address {

    private String name;
    private String phonenumber;
    private String company;

    public Address(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.company = "";
    }

    public Address(String name, String phonenumber, String company) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.company = company;
    }

    public String toString() {
        return String.format("name : %s, phonenumber : %s, company : %s", this.name, this.phonenumber, this.company);
    }
}
