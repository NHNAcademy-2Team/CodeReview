package unit.eight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


// 더 쪼개보기

public class Exercise5 {
    public static String getAverage(String filename) throws IOException {
        FileReader f = new FileReader(filename);
        BufferedReader br = new BufferedReader(f);
        double max = 0;
        String student = "";

        System.out.println("Information of Students");

        String line = br.readLine();
        while(line != null) {
            double average = scoreAverage(line);
            if(max < average) {
                max = average;
                student = line;
            }
            System.out.println(line + ", average: " + scoreAverage(line));
            line = br.readLine();
        }

        f.close();

        return "the name of the student with the hightest average marking\n"
                + student + ", average: " + Double.toString(max);
    }

    public static double scoreAverage(String line) {
        // info[0]: name, info[1~]
        String[] info = line.split(" ");
        double total = 0;

        for(int i =1; i<info.length; i++) {
            total += Integer.parseInt(info[i]);
        }

        return total / (info.length - 1);
    }

    public static void main(String[] args) {
        try {
            System.out.println(getAverage("src/main/java/unit/eight/resource/examInfo"));
        }catch (IOException e) {
            System.out.println("파일을 찾을 수 없습니다. 파일 이름을 확인해주세요");
        }
    }
}
