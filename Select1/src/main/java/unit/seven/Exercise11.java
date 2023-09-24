package unit.seven;

public class Exercise11 {
    /**
     *
     * Exercise 07.11 A matrix M is said to be diagonal if all elements M[i][j] with i different from j (i.e., that are
     * not on the main diagonal) are equal to 0. Write a predicate static boolean diagonal(int[][] M) that returns true
     * if the matrix M is diagonal, and false otherwise.
     * */

    static boolean diagonal(int[][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if(i == j){
                    if(arrays[i][j] == 0)
                        return false;
                } else {
                    if(arrays[i][j] != 0)
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arrays = {  { 1, 0, 0, 0, 0},
                            { 0, 1, 0, 0, 0},
                            { 0, 0, 1, 0, 0},
                            { 0, 0, 0, 1, 0},
                            { 0, 0, 0, 0, 1}
        };
        System.out.println(diagonal(arrays));
    }
}
