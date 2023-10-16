package eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import seven.Apartment;

// Unit 7 Apartment method add

public class Exercise8 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("/Users/taehee/과정1/unit/resources/seven/apartment.txt"));
        Apartment apartment = Apartment.readFromFile(br);
        Apartment.printApartment(apartment);

        br.close();
    }
}
