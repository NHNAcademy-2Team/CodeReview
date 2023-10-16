package unit.nine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// 보류

public class Exercise7 {
    public boolean fileExists(String filename) {
        File file = new File(filename);
        return file.exists();
    }

    public boolean isInt(String filename) {
        FileReader file;
        BufferedReader br;
        try {
            file = new FileReader(filename);
            br = new BufferedReader(file);

            String line()
        } catch() {

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
