package unit.nine;

import java.io.File;

public class Exercise7 {
    public static boolean fileExists(String fileName){
        File file = new File(fileName);
        return file.exists();
    }

    public static boolean isInt(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String str){
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static void main(String[] args) {
        String fileName = "test.txt";
        System.out.println("File exists: " + fileExists(fileName));

        String intString = "123";
        System.out.println(intString + " is an integer: " + isInt(intString));

        String nonDoubleString = "123.45abc";
        System.out.println(nonDoubleString + " is a double: " + isDouble(nonDoubleString));
    }
}
