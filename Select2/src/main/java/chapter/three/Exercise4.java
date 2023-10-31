package chapter.three;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String sentence = sc.nextLine();
            ListWordsInString.print(sentence);
        }
    }
}

class ListWordsInString{
    public static void print(String sentence){
        String[] arrays = sentence.split("");

        for (int i = 0; i < arrays.length; i++) {
            if (Character.isLetter(arrays[i].charAt(0)))
                System.out.print(arrays[i]);
            else if(arrays[i].equals(" ") || arrays[i].equals("'"))
                System.out.println();
        }
    }
}
