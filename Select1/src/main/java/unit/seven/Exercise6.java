package unit.seven;

/**
 * Link : https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
 * Exercise 07.6
 * A duplicate in an array is a value that appears more than once as element of the array.
 * Write a method static int numberOfDuplicates(int[] A) that returns the number of distinct duplicates in the array A.
 * Write also a method static int numberOfDistinctValues(int[] A) that returns the number of distinct values in the array A.
 */
public class Exercise6 {
    public static boolean searchArray(int[] array, int value, int index){
        for(int i = index+1; i < array.length; i++){
            if(array[i] == value)
                return true;
        }
        return false;
    }
    public static int numberOfDuplicates(int[] A){
        return A.length - numberOfDistinctValues(A);
    }
    public static int numberOfDistinctValues(int[] A){
        int count = 0;
        for(int i = 0; i < A.length; i++){
            if(!searchArray(A, A[i], i)){
                count++;
            }
        }
        return count;
    }

    public static void test(){
        int[] arr = {1, 2, 3, 1, 2, 4, 9, 2, 2};
        System.out.println(numberOfDuplicates(arr));
        System.out.println(numberOfDistinctValues(arr));
    }

    public static void main(String[] args) {
        test();
    }
}
