package eight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

// Exercise6.java

public class IOFile {
    private String filename;

    public IOFile(String filename) {
        this.filename = filename;
    }

    public int countLines() throws IOException {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(this.filename))) {
            while (br.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            System.out.println("파일을 열 수 없습니다.");
        }
        return count;
    }

    public void write(OutputStream os) throws IOException {
        String data;
        os = new FileOutputStream(this.filename, true);

        try (InputStream is = System.in;
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                PrintWriter pw = new PrintWriter(os)) {

            while (!(data = br.readLine()).equals("")) {
                pw.write(data + "\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void print() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(this.filename))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void copy(String filename) throws IOException {
        String data;

        try (BufferedReader br = new BufferedReader(new FileReader(this.filename));
                BufferedWriter bw = new BufferedWriter(new FileWriter(filename, false))) {
            while (br.ready()) {
                data = br.readLine();
                bw.write(data + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete() {
        File file = new File(filename);

        if (file.exists())
            file.delete();
        else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }

}
