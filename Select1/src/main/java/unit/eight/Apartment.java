package unit.eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Apartment {
    private int size;
    private String address;
    private String[] persons;
    private int peopleNum;

    public Apartment(int size, String address) {
        this.size = size * size;
        this.address = address;
        this.persons = new String[10];
        this.peopleNum = 0;
    }

    public int getSize() {
        return this.size;
    }

    public String getAddress() {
        return this.address;
    }

    public int getNumberOfPeople() {
        return this.peopleNum;
    }

    public String getPerson(int num) {
        if (num >= 0 && this.peopleNum > num) {
            return persons[num];
        }
        return null;
    }

    public void addPerson(String name) {
        if (peopleNum != 10) {
            persons[peopleNum++] = name;
        }
    }

    public void removePerson(int num) {
        if(num >= 0 && num < this.peopleNum ) {
            for(int i = num; i < peopleNum; i++) {
                this.persons[i] = this.persons[i + 1];
            }
            this.persons[peopleNum--] = null;
        }
    }

    public void saveToFile(String fileName) throws IOException {
        FileWriter f = new FileWriter(fileName);
        try (PrintWriter out = new PrintWriter(f)) {
            out.println(this.squareMetersSize);
            out.println(this.address);
            for (int i = 0; i < this.apartments.length; i++) {
                if(this.apartments[i] == null)
                    break;
                out.println(this.apartments[i]);
            }
        }
    }

    public static Apartment readFromFile(BufferedReader br) throws IOException {
        String first = br.readLine();
        String second = br.readLine();
        if (first == null || second == null) {
            return null;
        }
        return new Apartment(Integer.parseInt(first), second);
    }

    public static void printApartment(String fileName) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (String person : this.persons) {
            if (person == (null)) {
                break;
            }
            sb.append(person + ", ");
        }

        return "[ APARTMENT ]\n" + "Address: " + getAddress()
                + "\nSize Of Apartment: " + getSize() + "\nPeople Num: "
                + getNumberOfPeople() + "\nLiving People List: " + sb.toString();
    }
}
