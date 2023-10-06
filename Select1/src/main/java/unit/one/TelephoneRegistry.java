package unit.one;

import java.util.ArrayList;

public class TelephoneRegistry {
    private ArrayList<Telephone> telephoneRegistry = new ArrayList<>();

    public void add(Telephone telephone){
        telephoneRegistry.add(telephone);
    }

    public ArrayList<Telephone> getTelephoneRegistry(){
        return this.telephoneRegistry;
    }
}