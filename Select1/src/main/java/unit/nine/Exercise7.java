package unit.nine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 보류

public class Exercise7 {
    public static boolean fileExists(String filename) {
        File file = new File(filename);
        return file.exists();
    }

    public static boolean isInt(String line) {
        try{
            Integer.parseInt(line);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isDouble(String line) {
        try{
            Double.parseDouble(line);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
