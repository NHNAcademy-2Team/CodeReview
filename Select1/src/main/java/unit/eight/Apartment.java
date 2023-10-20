package unit.eight;

// Exercise8.7~9해야됨

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
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


    // Exercise 08.8
    public void saveToFile(String filename) {
        PrintWriter out;
        try{
            out = new PrintWriter(filename);
            out.println(this.toString());
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFromFile(BufferedReader br) {
        try {
            String line = br.readLine();
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch(IOException e) {
            System.out.println("파일 이름 또는 위치를 확인해주세요");
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


        apt.saveToFile("src/main/java/unit/resource/aptData");
        try {
            readFromFile(new BufferedReader(new FileReader("src/main/java/unit/resource/aptData")));
        } catch(FileNotFoundException e) {
            System.out.println("파일 위치 혹은 경로를 확인해다오");
        }
    }
}
