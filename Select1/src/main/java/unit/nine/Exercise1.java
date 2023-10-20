package unit.nine;

public class Exercise1 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0, j = 0; i < 10 && j < 10; i++, j++) {
            System.out.println(i + " + " + j + " = " + (i+j));
        }
        System.out.println("I've printed out the sums of i and j up to " + i + ", " + j);
    }
}

/*
* (i) compile error created
*
*  0 + 0 = 0
*  1 + 1 = 2
*     ...
*     ...
*     ...
*  9 + 9 = 18
* I've printed out the sums of 10 and 10 up to 10, 10
* */