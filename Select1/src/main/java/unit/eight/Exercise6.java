package unit.eight;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

/**
 * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni08/node24.html
 * Exercise 08.6 Realize a class IOFile that exports some functionalities on text files. The class should have a constructor with one parameter of type String, representing the name of the file on which to operate, and should export the following methods:
 * int countLines() : that returns the number of lines of the file;
 * void write(OutputStream os) : that writes the content of the file to os;
 * void print() : that prints the content of the file to the video;
 * void copy(String filename) : that copies the content of the file to the file specified by filename;
 * void delete() : that deletes the file from mass-storage.
 */
public class Exercise6 {
    private String fileName;

    public Exercise6(String fileName) {
        this.fileName = fileName;
    }

    public int countLines() throws IOException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName))) {
            while (br.readLine() != null) {
                count++;
            }
        }
        return count;
    }

    public void write(OutputStream os) throws IOException {
        try (PrintWriter pw = new PrintWriter(os); BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String line;
            while(!((line = reader.readLine()).isEmpty())){
                pw.println(line);
            }
        }
    }

    public void print() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(this.fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public void copy(String fileName) throws IOException {
        try (FileInputStream fis = new FileInputStream(this.fileName);
             FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] b = new byte[1024];
            int len;
            while ((len = fis.read(b, 0, 1024)) > 0) {
                fos.write(b, 0, len);
            }
        }
    }

    public void delete() throws NoSuchFileException, DirectoryNotEmptyException, IOException {
        Files.delete(Path.of(this.fileName));
    }
}
