package unit.seven;

/* Exercise 7.12
 * Realize a Java class Apartment, whose objects maintain the following information
 *   an integer that indicates the size in square meters of the apartment, the address,
 *   and a list of maximal 10 names of persons that live in the apartment.
 *   Each person living in the apartment has an associated number between 0
 *   and the number of persons currently living in the apartment minus 1.
 */

/*
 * The class should export the following functionalities:
 *   - a constructor that takes a size and an address and creates an apartment that is initially empty;
 *   - a method that returns the size of the apartment;
 *   - a method that returns the address of the apartment;
 *   - a method that returns the number of persons currently living in the apartment;
 *   - a method that takes as parameter the name of a person, and adds the person to those living in the apartment;
 *     the person gets assigned the next available number, if there is still room;
 *     if the apartment is full (i.e., 10 persons already live there), the method does nothing;
 *   - a method that takes as parameter a nonnegative integer number
 *     and returns the name of the person associated to that number and living in the apartment;
 *     if the number is greater than or equal to the number of persons in the apartment, the method returns null;
 *   - a method that takes as parameter a nonnegative integer number
 *     and removes the person associated to that number from the apartment;
 *     the number associated to all following persons should be decreased by one;
 *     if the number is greater than or equal to the number of persons in the apartment, the method does nothing.
 *   - a method toString that does overriding of toString inherited from object,
 *     and returns a string with all the information about the apartment.
 */

public class Exercise12 {
    public static void main(String[] args) {
        Apartment apt = new Apartment(20, "Seoul");


        apt.addPerson("Kim");
        apt.addPerson("Park");

        System.out.println(apt.getPerson(1));
        System.out.println(apt.getPerson(2));
        System.out.println(apt.getNumberOfPeople());
        System.out.println(apt.toString());

        apt.removePerson(0);
        System.out.println(apt.toString());

    }
}
