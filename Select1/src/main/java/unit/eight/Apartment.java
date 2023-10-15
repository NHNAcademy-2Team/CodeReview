package unit.eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Apartment {
    private int squareMetersSize;
    private String address;
    private String[] apartments;

    public Apartment(int squareMetersSize, String address) {
        this.squareMetersSize = squareMetersSize;
        this.address = address;
        this.apartments = new String[10];
    }

    public int getSquareMetersSize() {
        return this.squareMetersSize;
    }

    public String getAddress() {
        return this.address;
    }

    public int countApartments() {
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            if (apartments[i] != null) {
                cnt++;
            }
        }
        return cnt;
    }

    public void setApartment(String personName) {
        for (int i = 0; i < 10; i++) {
            if (apartments[i] == null) {
                apartments[i] = personName;
                break;
            }
        }
    }

    public String getApartment(int slot) {
        if (slot < 0) {
            throw new IllegalArgumentException("음이 아닌 정수를 입력해주세요.");
        }
        if (slot >= 10) {
            return null;
        }
        return apartments[slot];
    }

    public void removeApartment(int slot) {
        if (slot < 0) {
            throw new IllegalArgumentException("음이 아닌 정수를 입력해주세요.");
        }
        if (slot >= 10) {
            throw new IllegalArgumentException("입력 범위를 넘겼습니다.");
        }
        apartments[slot] = null;
    }

    public void reorganizeApartments() {
        int empty = -1;
        for (int i = 0; i < 10; i++) {
            if (apartments[i] == null && empty == -1) {
                empty = i;
            }
            if (apartments[i] != null && empty != -1) {
                apartments[empty] = apartments[i];
                apartments[i] = null;
                empty++;
            }
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
        StringBuilder sb = new StringBuilder();
        sb.append("Size: ")
                .append(this.squareMetersSize)
                .append(", ")
                .append("Address: ")
                .append(this.address);
        for (int i = 0; i < 10; i++) {
            if (apartments[i] != null) {
                sb.append("\nApartment ")
                        .append(i)
                        .append(": ")
                        .append(apartments[i]);
            }
        }
        return sb.toString();
    }
}
