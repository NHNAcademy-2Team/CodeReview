package unit.eight;

import java.io.IOException;
import unit.seven.Apartment;

public class Exercise8 {

    /*
    Exercise 8.8.
    Add to the class Apartment of Exercise 7.12 a public method saveToFile that takes as a parameter a filename and saves the data about the apartment to the file.
    Add also a public static method readFromFile that takes as a parameter a BufferedReader object specifying an input channel, reads from the channel the data about an apartment (organized as written by saveToFile), and constructs and returns the apartment.
    Then, write a static method, client of the class Apartment, that takes as parameter a filename and prints on the video all the information about the apartments on the file.
     */

    public static void main(String[] args) throws IOException {

        String filename = "Apartment.txt";
        Apartment apartment = new Apartment(30, "광주");
        apartment.setName("양진영");
        apartment.setName("이태희");
        apartment.setName("순수연");
        apartment.setName("홍지원");
        apartment.setName("이가은");
        apartment.setName("김승현");
        apartment.setName("김바보");

        apartment.saveToFile(filename);
        Apartment.printApartment(filename);


    }


}
