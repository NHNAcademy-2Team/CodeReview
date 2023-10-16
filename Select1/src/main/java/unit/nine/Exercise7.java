package nine;

import java.io.File;

public class Exercise7 {

    public static boolean fileExists(String filename) {
        File file = new File(filename);
        return file.exists();
    }

    public static boolean isInt(String word) {
        try {
            Integer.parseInt(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String word) {
        try {
            Double.parseDouble(word);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(fileExists("exercise7.txt")); // false
        System.out.println(isInt("10")); // true
        System.out.println(isDouble("hi")); // false
    }
}
