package unit.seven;

/**
 * Link : https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
 * Exercise 07.10
 * A matrix M is said to be lower triangular if all elements M[i][j] with i<j (i.e., that are "above" the main diagonal) are equal to 0.
 * Write a predicate static boolean lowerTriangular(int[][] M) that returns true if the matrix M is lower triangular, and false otherwise.
 */
public class Exercise10 {
    public static boolean lowerTriangular(int[][] M){
        if(M.length != M[0].length)
            throw new IllegalArgumentException("정방행렬이 아니기 때문에 하삼각행렬의 조건이 될 수 없습니다.");
        for(int i = 0; i < M.length-1; i++){
            for(int j = i+1; j < M.length; j++){
                if(M[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
    public static void lowerTriangularTest(){
        int[][][] testMatrix = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{1, 0, 0}, {2, 7, 0}, {3, 8, 9}},
                {{1, 0, 0, 0}, {2, 7, 0, 0}, {3, 8, 9, 0}}
        };
        for(int[][] test : testMatrix){
            System.out.println(lowerTriangular(test));
        }
    }

    public static void main(String[] args) {
        lowerTriangularTest();
    }
}
