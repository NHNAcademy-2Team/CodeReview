package unit.seven;

/**
 * Link : https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
 * Exercise 07.12
 * Realize a Java class Apartment, whose objects maintain the following information: an integer that indicates the size in square meters of the apartment, the address, and a list of maximal 10 names of persons that live in the apartment.
 * Each person living in the apartment has an associated number between 0 and the number of persons currently living in the apartment minus 1.
 * The class should export the following functionalities:
 * a constructor that takes a size and an address and creates an apartment that is initially empty;
 * a method that returns the size of the apartment;
 * a method that returns the address of the apartment;
 * a method that returns the number of persons currently living in the apartment;
 * a method that takes as parameter the name of a person, and adds the person to those living in the apartment; the person gets assigned the next available number, if there is still room; if the apartment is full (i.e., 10 persons already live there), the method does nothing;
 * a method that takes as parameter a nonnegative integer number and returns the name of the person associated to that number and living in the apartment; if the number is greater than or equal to the number of persons in the apartment, the method returns null;
 * a method that takes as parameter a nonnegative integer number and removes the person associated to that number from the apartment; the number associated to all following persons should be decreased by one; if the number is greater than or equal to the number of persons in the apartment, the method does nothing.
 * a method toString that does overriding of toString inherited from object, and returns a string with all the information about the apartment.
 */
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
