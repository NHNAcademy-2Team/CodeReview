package unit.eight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Apartment {
    /**
     * Exercise 12
     * 
     * Unit 8 Exercise 8
     * saveToFile, readFromFile, printApartment method
     */
    private int size;
    private String address;
    private String[] people;
    private int count = 0;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        this.people = new String[10];
    }

    public String houseOwner(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("음이 아닌 정수를 입력해주세요.");
        } else if (n >= 10) {
            return null;
        } else {
            return people[n];
        }
    }

    public void removePeople(int n) {
        if (n < count) {
            for (int i = n; i < count - 1; i++) {
                people[i] = people[i + 1];
            }
            count--;
            people[count] = null;
        }
    }

    public void setPeople(String name) {
        if (count < 10) {
            people[count] = name;
            count++;
        } else {
            System.out.println("아파트에 자리가 없습니다.");
        }
    }

    public int getSize() {
        return this.size;
    }

    public String getAddress() {
        return this.address;
    }

    public String[] getPeople() {
        return this.people;
    }

    public String toString() {
        return "아파트 주소 : " + getAddress() + "\n아파트 크기 : " + getSize() + "\n아파트 입주자 : " + Arrays.toString(getPeople());
    }

    // Unit 8 Exercise 8
    public void saveToFile(String fileName) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            bw.write("size " + this.size + "\n");
            bw.write("address " + this.address + "\n");
            for (int i = 0; i < count; i++) {
                bw.write(i + "번지 " + this.people[i] + "\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Unit 8 Exercise 8
    public static Apartment readFromFile(BufferedReader br) throws IOException {
        Apartment apartment;
        String data;

        if (!br.ready())
            throw new FileNotFoundException("파일이 존재하지 않습니다.");

        int size = 0;
        String address = "";

        String[] sentence = (br.readLine()).split(" ");
        size = Integer.parseInt(sentence[1]);

        sentence = (br.readLine()).split(" ");
        address = sentence[1];

        apartment = new Apartment(size, address);

        try {
            while (br.ready()) {
                data = br.readLine();
                sentence = data.split(" ");

                apartment.setPeople(sentence[1]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return apartment;
    }

    // Unit 8 Exercise 8
    public static void printApartment(String filename) throws IOException {
        System.out.println(readFromFile(new BufferedReader(new FileReader(filename))));
    }
}
