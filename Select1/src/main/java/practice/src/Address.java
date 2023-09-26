public class Address {
    private String name;
    private String phonenumber;
    private String company;

    public Address(String name, String phonenumber, String company) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.company = company;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String toString() {
        return name + " | " + phonenumber + " | " + company;
    }
}
