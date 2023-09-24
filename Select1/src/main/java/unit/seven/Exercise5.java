package unit.seven;

/**
 * Link : https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
 * Exercise 07.5
 * Write a predicate static boolean equalArrays(int[] A, int[] B) that returns true if the two arrays A and B are equal (i.e., A[i] is equal to B[i], for each i), and false otherwise.
 */
public class Exercise5 {
    public static boolean equalArrays(int[] A, int[] B){
        if(A.length != B.length)
            return false;
        for(int i = 0; i < A.length; i++){
            if(A[i] != B[i])
                return false;
        }
        return true;
    }
    public static void equalArraysTest(){
        int[][] TestA = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        int[][] TestB = {{1, 2, 3, 4, 5}, {5, 6, 7, 8, 9}};
        for(int i = 0; i < TestA.length; i++){
            System.out.println(equalArrays(TestA[i], TestB[i]));
        }
    }

    public static void main(String[] args) {
        equalArraysTest();
    }
}
