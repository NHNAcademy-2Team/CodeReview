package unit.eight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class IOFile {
    // try-with-resource 알아서 사용해보기
    // 파일을 읽어와서 작업하는 클래스 working after InputFile;
    // EndOfFile을 찍을 경우, 파일을 닫고 다시 열어줘야함요.

    private String filename;
    private FileReader fr;
    private BufferedReader br;


    public IOFile(String filename) {
        this.filename = filename;
        this.fr = null;
        this.br = null;
    }

    public int countLines() throws IOException {
        int count = 0;

        fr = new FileReader(filename);
        br = new BufferedReader(fr);

        while (br.readLine() != null) {
            count++;
        }

        fr.close();
        br.close();

        return count;
    }

    // OutputStream os = System.out;
    // FileOutputStream os = new FileOUtputStream("test.txt");
    // new FileOutPutStream("test.txt", false);

    // write(os);

    public void write(OutputStream os) throws IOException {
        fr = new FileReader(filename);
        br = new BufferedReader(fr);

        PrintWriter out = new PrintWriter(os);
        String line = br.readLine();

        while(line != null) {
            out.println(line);
            line = br.readLine();
        }

        fr.close();
        br.close();
        out.close();
    }

    public void print() throws IOException {
//        fr = new FileReader(this.filename);
//        br = new BufferedReader(fr);
//
//        String line = br.readLine();
//
//        while(line != null) {
//            System.out.println(line);
//            line = br.readLine();
//        }
//
//        fr.close();
//        br.close();
        write(System.out);
    }

    public void copy(String filename) throws IOException {
        write(new FileOutputStream(filename, false));
    }

    public void delete() {
        File f = new File(filename);
        f.delete();
    }

    public static void main(String[] args) throws IOException {
        IOFile file = new IOFile("src/main/java/unit/eight/resource/examInfo");
        IOFile file2 = new IOFile("src/main/java/unit/eight/resource/hello2");
//        FileOutputStream os = new FileOutputStream("src/main/java/unit/eight/hello2");
//        file.write(os);


        file.print();
        file.write(new FileOutputStream("src/main/java/unit/eight/resource/hello2", true));

        file2.print();


    }
}
