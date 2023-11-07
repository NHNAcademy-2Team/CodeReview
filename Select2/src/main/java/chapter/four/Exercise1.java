package chapter.four;

import java.util.Scanner;

public class Exercise1 {

    public static void printCapitalized(String sentence){
        int i = 0;
        char temp;

        while(i < sentence.length()){
            temp = sentence.charAt(i);

            if(i == 0){
                System.out.print(Character.toUpperCase(temp));
            } else if (Character.isLetter(temp) && (sentence.charAt(i - 1) == ' ') ) {
                System.out.print(Character.toUpperCase(temp));
            } else {
                System.out.print(temp);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        printCapitalized(sentence);

        scanner.close();
    }
}
