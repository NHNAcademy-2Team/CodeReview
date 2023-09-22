package unit.seven;

public class Exercise9 {
    public static boolean symmetric(int[][] M){
        for(int i = 0; i < M.length-1; i++){
            for(int j = i+1; j < M.length; j++){
                if(M[i][j] != M[j][i])
                    return false;
            }
        }
        return true;
    }

    public static void symmetricTest(){
        int[][][] testMatrix = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{1, 2, 3}, {2, 7, 8}, {3, 8, 9}}
        };
        for(int[][] test : testMatrix){
            System.out.println(symmetric(test));
        }
    }
    public static void main(String[] args) {
        symmetricTest();
    }
}
