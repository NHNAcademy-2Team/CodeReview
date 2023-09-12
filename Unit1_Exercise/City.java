public class City {

    private String city;
    private String telephoneNum;
    private String personName;

    public City(String city, String personName, String telephoneNum) {
        this.city = city;
        this.telephoneNum = telephoneNum;
        this.personName = personName;
    }

    public String getCity() {
        return city;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public String getPersonName() {
        return personName;
    }

    
    @Override
    public String toString() {
        return String.format("%s, %s, %s", city, personName, telephoneNum);
    }
    
}
