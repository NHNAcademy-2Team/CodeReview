package unit.seven;

import java.util.HashMap;
import java.util.Map;

public class Apartment {
    private int size;
    private String address;
    private Map<Integer, String> name;
    private int maxNum = 10;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        this.name = new HashMap();
    }

    public int getSize() {
        return this.size;
    }

    public String getAddress() {
        return this.address;
    }

    public int getResidenceNum() {
        return this.name.size();
    }

    public void setName(String name) {
        if (this.name.size() < maxNum) {
            this.name.put(this.name.size(), name);
        }
    }

    public String getName(int personNum) {

        if (personNum < 0 || personNum >= this.name.size()) {
            return null;
        }

        return name.get(personNum);
    }

    public void removeName(int personNum) {

        if (personNum < 0 || personNum >= this.name.size()) {
            return;
        }

        name.remove(personNum);
    }

    public String toString() {
        return String.format("아파트 크기 : %d, 아파트 주소 : %s, 아파트 주민 수 : %d, 아파트 주민 : %s", this.size, this.address, this.name.size(), this.name);
    }


}
