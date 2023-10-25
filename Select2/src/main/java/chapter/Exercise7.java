package chapter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise7 {

    private static List<String> list = new ArrayList<>();
    private static String name = "";



    public static void main(String[] args) {
        File file = new File("../Select2/src/main/resources/testdata.txt");
        if (file.exists()) {
            read(file);
            print();
        }
    }

    public static void read(File file) {

        try (BufferedReader br = new BufferedReader(new FileReader(file));) {

            String line;
            while ((line = br.readLine()) != null) {
                if (isNum(line)) {
                    list.add(line);
                } else {
                    name = line;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static boolean isNum(String line) {
        try {
            Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }


    public static int avg(List<String> list) {
        int result = 0;

        for (int i = 0; i < list.size(); i++) {
            result += Integer.parseInt(list.get(i));
        }
        return result / (list.size());
    }

    public static int countLine(BufferedReader br) throws IOException {
        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            count++;
        }
        return count;
    }

    public static void print() {
        if (list.size() > 1) {
            System.out.printf("%s의 평균 성적 : %d" , name, avg(list));
        }
    }


}
