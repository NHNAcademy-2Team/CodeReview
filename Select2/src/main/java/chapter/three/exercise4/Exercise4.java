package chapter.three.exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            System.out.println(deleteSpecialLetters(line));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String deleteSpecialLetters(String line){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < line.length(); i++){
            char character = line.charAt(i);
            if(Character.isLetter(character)){
                sb.append(character);
            }else if(character == ' '){
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}