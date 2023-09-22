package unit.seven;

public class Apartment {
    private int squareMetersSize;
    private String address;
    private String[] apartments;

    public Apartment(int squareMetersSize, String address){
        this.squareMetersSize = squareMetersSize;
        this.address = address;
        this.apartments = new String[10];
    }

    public int getSquareMetersSize(){
        return this.squareMetersSize;
    }

    public String getAddress(){
        return this.address;
    }

    public int countApartments() {
        int cnt = 0;
        for(int i = 0; i < 10; i++)
            if(apartments[i] != null)
                cnt++;
        return cnt;
    }

    public void setApartment(String personName){
        for(int i = 0; i < 10; i++){
            if(apartments[i] == null) {
                apartments[i] = personName;
                break;
            }
        }
    }

    public String getApartment(int slot) {
        if(slot < 0)
            throw new IllegalArgumentException("음이 아닌 정수를 입력해주세요.");
        if(slot >= 10)
            return null;
        return apartments[slot];
    }
    public void removeApartment(int slot){
        if(slot < 0)
            throw new IllegalArgumentException("음이 아닌 정수를 입력해주세요.");
        if(slot >= 10)
            throw new IllegalArgumentException("입력 범위를 넘겼습니다.");
        apartments[slot] = null;
    }
    public void reorganizeApartments() {
        int empty = -1;
        for (int i = 0; i < 10; i++) {
            if (apartments[i] == null && empty == -1)
                empty = i;
            if (apartments[i] != null && empty != -1) {
                apartments[empty] = apartments[i];
                apartments[i] = null;
                empty++;
            }
        }
    }

    public String toString(){
        String ris = "";
        ris += "Size: " + this.squareMetersSize + ", ";
        ris += "Address: " + this.address;
        for (int i = 0; i < 10; i++)
            if (apartments[i] != null)
                ris += "\nApartment " + i + ": " + apartments[i];
        return ris;
    }
}
