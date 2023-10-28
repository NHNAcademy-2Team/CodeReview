package chapter.three.exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    private static final String SPEACIALCHARACTER
            = "[{}\\[\\]/?.,;:|)*~`!^\\-_+<>@#$%&=('\"]";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            System.out.println(line.replaceAll(SPEACIALCHARACTER, "").replaceAll("\\s", "\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
