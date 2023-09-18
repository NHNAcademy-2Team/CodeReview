public class Operator {
    private static TelephoneRegistry telephoneList = new TelephoneRegistry();

    public static TelephoneRegistry pickCity(TelephoneRegistry telephones, String city){
        for(Telephone telephone : telephones.getTelephoneRegistry()){
            if(telephone.getCity().equals(city)){
                telephoneList.add(telephone);
            }
        }
        return telephoneList;
    }

    public static String searchPhoneNumber(String name){
        String searchPhone = "";
        for(Telephone telephone : telephoneList.getTelephoneRegistry()){
            if(telephone.getName().equals(name)){
                searchPhone = telephone.getTelephone();
            }
        }
        return searchPhone;
    }

}
