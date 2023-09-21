package unit.five;

import java.util.Scanner;

public class Exercise4 {
    //보류
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] lengths = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the lengths of the three sides : ");
            lengths[i] = scan.nextInt();
        }

        measure(lengths);


    }

    public static int measure(int[] lengths) {

        sort(lengths);

        return 0;
    }

    public static int[] sort(int[] lengths) {
        int longest;
        int intermediate;
        int shortest;

        if (lengths[0] >= lengths[1] && lengths[0] >= lengths[2]) {
            longest = lengths[0];
            if (lengths[1] >= lengths[2]) {
                intermediate = lengths[1];
                shortest = lengths[2];
            } else {
                intermediate = lengths[2];
                shortest = lengths[1];
            }
        } else if (lengths[1] >= lengths[0] && lengths[1] >= lengths[2]) {
            longest = lengths[1];
            if (lengths[0] >= lengths[2]) {
                intermediate = lengths[0];
                shortest = lengths[2];
            } else {
                intermediate = lengths[2];
                shortest = lengths[0];
            }
        } else {
            longest = lengths[2];
            if (lengths[0] >= lengths[1]) {
                intermediate = lengths[0];
                shortest = lengths[1];
            } else {
                intermediate = lengths[1];
                shortest = lengths[0];
            }
        }
        int[] result = {shortest, intermediate, longest};
        return result;
    }

    public static int shortest(int[] lengths) {
        int shortest = 0;


        return shortest;
    }


}
