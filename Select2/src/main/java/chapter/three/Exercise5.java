package chapter.three;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    private static int count;

    //모든 도시의 총 매출을 계산하고 인쇄할 프로그램을 작성하라. 이 프로그램은 또한 데이터가 제공되지 않은 도시의 갯수를 보고해야 한다.
    public static void main(String[] args) {

        File file = new File("../Select2/src/main/resources/sales.dat");
        if (file.exists()) {
            read(file);
        }

    }

    public static void read(File file) {
        String line;
        String subLine;
        String[] split;
        List<Double> list = new ArrayList<>();
        int index;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {
                subLine = line.trim();
                split = subLine.split(":");

                if (isDouble(subLine)) {
                    list.add(Double.parseDouble(split[1]));
                }

            }

            print(list);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print(List<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("총 매출 : " + sum);
        System.out.println("데이터 미제공 도시 수 : " + count);
    }

    public static boolean isDouble(String line) {
        try {
            Double.parseDouble(line);
        } catch (NumberFormatException e) {
            count++;
            return false;
        }

        return true;
    }
}
