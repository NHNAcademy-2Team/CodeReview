package unit.eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExerciseThree {
    public static void printFile(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while(line != null) {
            if(line.length() != 0) {
                char tmp = line.charAt(0);
                if(tmp == '/' || tmp == '%' || tmp == ';') {
                    System.out.println(line);
                }
            }
            line = br.readLine();
        }

        fr.close();
    }

    public static void main(String[] args) {
        try {
            printFile("src/main/java/unit/eight/resource/test");
        } catch(IOException e) {
            System.out.println("파일이 존재하지 않습니다. 파일이름과 파일위치를 확인해주세요");
        }
    }
}
