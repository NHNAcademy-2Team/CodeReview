package unit.nine;

public class Exercise1 {
    public static void main(String[] args){
        // for (int i = 0, j = 0; i < 10, j < 10; i++, j++) {
        //     System.out.println(i + " + " + j + " = " + (i+j));
        // }
        // System.out.println("I've printed out the sums of i and j up to " + i + "," + j);

        int lastI = 0;
        int lastJ = 0;

            for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
                System.out.println(i + " + " + j + " = " + (i+j));
                lastI = i;
                lastJ = j;
            }
            System.out.println("I've printed out the sums of i and j up to " + lastI + "," + lastJ);
    }
}