import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TelephoneRegistry {

    private String city;
    private String personNames;
    private String telephoneNumbers;
    // private Map<String, String> telephoneList = new HashMap<>();
    private ArrayList<City> telephoneList = new ArrayList<>();


    public void add(City city) {
        telephoneList.add(city);
    }

    public ArrayList<City> getTelephone() {
        return telephoneList;
    }

    


}









