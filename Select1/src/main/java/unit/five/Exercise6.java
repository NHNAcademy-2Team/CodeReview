package unit.five;

import java.util.Scanner;

public class Exercise6 {

    static void printAnswer(String sentence){
        if (checkLineStart(sentence))
            System.out.print("MAYBE ");

        switch (sentence.charAt(sentence.length()-1)){
            case 'a' : case 'i' : case 'u' :
                System.out.println("YES");
                break;
            case 'e' : case 'o' :
                System.out.println("NO");
                break;
            default :
                System.out.println("DON'T KNOW");
                break;
        }
    }

    static boolean checkLineStart(String sentence){
        char[] vocal = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0; i < vocal.length; i++){
            if(sentence.charAt(0) == vocal[i])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        printAnswer(sentence);

        scanner.close();
    }
}
