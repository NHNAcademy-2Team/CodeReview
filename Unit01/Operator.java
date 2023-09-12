public class Operator {
    private String city;
    private String name;
    private TelephoneRegistry telephoneList = new TelephoneRegistry();
    public Operator(String city, String name){
        this.city = city;
        this.name = name;
    }

    public TelephoneRegistry pickCity(TelephoneRegistry telephones){
        for(Telephone telephone : telephones.getTelephoneRegistry()){
            if(telephone.getCity().equals(this.city)){
                telephoneList.add(telephone);
            }
        }
        return telephoneList;
    }

    public String searchPhoneNumber(){
        String searchPhone = "";
        for(Telephone telephone : telephoneList.getTelephoneRegistry()){
            if(telephone.getName().equals(this.name)){
                searchPhone = telephone.getTelephone();
            }
        }
        return searchPhone;
    }

}
