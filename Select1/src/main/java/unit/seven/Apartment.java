package unit.seven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private int size;
    private String address;
    private List name;
    private int maxNum = 10;


    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        this.name = new ArrayList();
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
            this.name.add(this.name.size() + " " + name);
        }
    }

    public String getName(int personNum) {

        if (personNum < 0 || personNum >= this.name.size()) {
            return null;
        }

        String name = String.valueOf(this.name.get(personNum));

        return personNum + " " + name;
    }

    public void removeName(int personNum) {

        if (personNum < 0 || personNum >= this.name.size()) {
            return;
        }

        name.remove(personNum);
    }

    public void saveToFile(String filename) {
        File file = new File("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/resources/" + filename);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));) {

            bw.write("크기 " + this.size + "\n");
            bw.write("주소 " + this.address + "\n");
            bw.write("주민수 " + this.size + "\n");

            for (int i = 0; i < this.name.size(); i++) {
                bw.write(String.valueOf(this.name.get(i)) + "\n");
            }

        } catch (IOException e) {
            System.out.println("잘못 입력하였습니다.");
        }

    }

    public static Apartment readFromFile(BufferedReader br) throws IOException {

        Apartment apartment = null;
        String[] apart = br.readLine().split(" ");
        int size = Integer.parseInt(apart[1]);
        apart = br.readLine().split(" ");
        String address = apart[1];
        String line = br.readLine();

        apartment = new Apartment(size, address);

        try {
            while ((line = br.readLine()) != null) {
                String[] people = line.split(" ");
                apartment.setName(people[1]);
            }

        } catch (IOException e) {
            System.out.println("잘못 입력하였습니다.");
        }
        return apartment;
    }

    public static void printApartment(String filename) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/resources/" + filename));

        System.out.println(Apartment.readFromFile(br).toString());


    }

    public String toString() {
        return String.format("크기 %d\n주소 %s\n주민수 %d\n주민 %s", this.size, this.address, this.name.size(), this.name);
    }


}
