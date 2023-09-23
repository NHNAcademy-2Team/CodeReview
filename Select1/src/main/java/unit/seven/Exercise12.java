package unit.seven;

/**
 * Link : https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
 * Exercise 07.12 Test
 */
public class Exercise12 {
    public static void apartmentTest(){
        Apartment apart = new Apartment(33, "dohoro 232-1");

        System.out.println("Size : " + apart.getSquareMetersSize());
        System.out.println("Address : " + apart.getAddress());
        System.out.println();

        apart.setApartment("Daniel");
        apart.setApartment("Minji");
        apart.setApartment("Hyerin");
        apart.setApartment("Hyein");
        apart.setApartment("Hani");
        System.out.println(apart);

        System.out.println();
        System.out.println("Apartment 2: " + apart.getApartment(2));
        System.out.println("Apartment count :" + apart.countApartments());
        System.out.println();

        apart.removeApartment(3);
        apart.removeApartment(4);
        apart.reorganizeApartments();
        System.out.println("Apartment count :" + apart.countApartments());
        System.out.println(apart);
        System.out.println();
    }
    public static void main(String[] args) {
        apartmentTest();
    }
}
