package unit.seven;

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
