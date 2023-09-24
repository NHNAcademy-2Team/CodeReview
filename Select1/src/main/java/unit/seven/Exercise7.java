package unit.seven;

/**
 * Link : https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
 * Exercise 07.7
 * Write a method static int[] removeDuplicates(int[] A) that returns a new array obtained from A by removing all duplicates.
 * The duplicates should be removed by keeping only the first occurrence of each distinct element, and shifting remaining elements upwards when a duplicate is removed.
 */
public class Exercise7 {
    public static boolean searchArray(int[] array, int value, int index){
        for(int i = 0; i < array.length; i++){
            if(i != index && array[i] == value)
                return true;
        }
        return false;
    }
    public static int[] removeDuplicates(int[] A){
        int[] result = new int[Exercise6.numberOfDistinctValues(A)];
        int index = 0;
        for(int i = 0; i < A.length; i++){
            if(!searchArray(A, A[i], i)){
                result[index++] = A[i];
            }
        }
        return result;
    }
    public static void removeDeuplicatesTest(){
        int[] test = {1, 2, 3, 1, 2, 4, 9, 2};
        int[] answer = removeDuplicates(test);
        for(int a : answer){
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        removeDeuplicatesTest();
    }
}
