package unit.seven;

public class Exercise10 {
    /**
     *
     * Exercise 07.10 A matrix M is said to be lower triangular if all elements M[i][j] with i<j (i.e., that are "above"
     * the main diagonal) are equal to 0. Write a predicate static boolean lowerTriangular(int[][] M) that returns true
     * if the matrix M is lower triangular, and false otherwise.
     * */

    static boolean lowerTriangular(int[][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if(i < j){
                    if(arrays[i][j] != 0)
                        return false;
                } else{
                    if(arrays[i][j] == 0)
                        return false;

                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arrays = {  { 1, 0, 0, 0, 0},
                            { 2, 3, 0, 0, 0},
                            { 3, 2, 5, 0, 0},
                            { 3, 4, 6, 1, 0},
                            { 5, 6, 3, 2, 1}
        };
        System.out.println(lowerTriangular(arrays));
    }
}
