package chapter.two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise7 {
    public static void main(String[] args) {
        String filename = "src/main/java/resources/testdata";
        FindAverage find = new FindAverage();
        find.fileReader(filename);
        System.out.println(find.toString());

    }

}

class FindAverage {
    private String name;
    private int[] score;

    private int count(String filename) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while (br.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public void fileReader(String filename) {
        this.score = new int[count(filename)];

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            this.name = br.readLine();

            for (int i = 0; i < score.length - 1; i++) {
                score[i] = Integer.parseInt(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private double avg() {
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum / score.length;
    }

    public String toString() {
        return this.name + "의 평균 : " + avg();
    }
}
