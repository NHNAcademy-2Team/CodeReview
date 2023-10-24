package unit.eight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class IOFile {
    private String name;
    private File file = new File("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/java/unit/eight/" + name);

    public IOFile(String filename) {
        this.name = filename;
    }

    public int countLines() {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file));) {

            while(br.readLine() != null) {
                count++;
            }

        } catch (IOException e) {
            System.out.println("올바른 입력값이 아닙니다.");
        }
        return count;
    }

    public void write(OutputStream os) {
        //that writes the content of the file to os;

        try (PrintWriter pw = new PrintWriter(os);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            String line = br.readLine();

            while((line = br.readLine()) != null) {
                pw.write(line);
            }

        } catch (IOException e) {
            System.out.println("올바른 입력값이 아닙니다.");
        }

    }

    public void print() {
        //that prints the content of the file to the video;
        try (BufferedReader br = new BufferedReader(new FileReader(file));) {

            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                System.out.println(br.readLine());
            }

        } catch (IOException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }
    }
    public void copy(String filename) {
        //that copies the content of the file to the file specified by filename;
        File file2 = new File("/Users/nhn/Desktop/Git/CodeReview/Select1/src/main/java/unit/eight/" + filename);

        try (BufferedReader br = new BufferedReader(new FileReader(this.file));
             OutputStream os = new FileOutputStream(file);
             PrintWriter pw = new PrintWriter(os);) {

            String line = br.readLine();
            while ((line = br.readLine()) != null) {
//                pw.
            }


        } catch (IOException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }

    }

    public void delete() {
        //that deletes the file from mass-storage.
    }

}
