public class Telephone {
    private String telephone;
    private String name;
    private String city;

    public Telephone(String telephone, String name, String city){
        this.telephone = telephone;
        this.name = name;
        this.city = city;
    }
    public String getTelephone(){
        return this.telephone;
    }

    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
}
