package unit.eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni08/node24.html
 * Apartment.class 에 구현
 * Exercise 08.8 Add to the class Apartment of Exercise 7.12 a public method saveToFile that takes as a parameter a filename and saves the data about the apartment to the file. Add also a public static method readFromFile that takes as a parameter a BufferedReader object specifying an input channel, reads from the channel the data about an apartment (organized as written by saveToFile), and constructs and returns the apartment. Then, write a static method, client of the class Apartment, that takes as parameter a filename and prints on the video all the information about the apartments on the file.
 */
public class Exercise8 {
    public static void main(String[] args) {
        try {
            apartmentTest();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void apartmentTest() throws IOException {
        Apartment apart = new Apartment(33, "dohoro 232-1");

        apart.setApartment("Daniel");
        apart.setApartment("Minji");
        apart.setApartment("Hyerin");
        apart.setApartment("Hyein");
        apart.setApartment("Hani");

        apart.removeApartment(3);
        apart.removeApartment(4);
        apart.reorganizeApartments();

        apart.saveToFile("/Users/suyeon/Documents/nhn/git/CodeReview/Select1/src/main/resources/apart.txt");

        try (BufferedReader br = new BufferedReader(
                new FileReader("/Users/suyeon/Documents/nhn/git/CodeReview/Select1/src/main/resources/apart2.txt"))) {
            Apartment apartment2 = Apartment.readFromFile(br);
            System.out.println(Objects.requireNonNull(apartment2).getSquareMetersSize());
            System.out.println(apartment2.getAddress());
        }
        System.out.println();
        Apartment.printApartment("/Users/suyeon/Documents/nhn/git/CodeReview/Select1/src/main/resources/apart.txt");
    }
}
