package practice;

public class Address {
    private String name;
    private String phoneNumber;
    private String company;
    public Address(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.company = "";
    }
    public Address(String name, String phoneNumber, String company){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.company = company;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCompany() {
        return this.company;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String toString(){
        return String.format("이름 : %s, 전화번호 : %s, 회사 : %s", this.name, this.phoneNumber, this.company);
    }
}
