package unit.seven;

/**
 * Link : https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
 * Exercise 07.2
 * Write a method static int[] intersection(int[] A, int[] B) that returns a new array containing the intersection of two arrays A and B, i.e., exactly those elements that are present both in A and in B (independently of their position).
 * We may assume that A and B do not contain duplicates, i.e., elements that appear more than once in the array.
 */
public class Exercise2 {
    public static boolean searchArray(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value)
                return true;
        }
        return false;
    }
    public static int intersectionCount(int[] A, int[] B){
        int count = 0;
        for(int i = 0; i < A.length; i++){
            if(searchArray(B, A[i])){
                count++;
            }
        }
        return count;
    }
    public static int[] intersection(int[] A, int[] B){
        int count = intersectionCount(A, B);
        int[] intersection = new int[count];
        int index = 0;
        for(int i = 0; i < A.length; i++){
            if(searchArray(B, A[i])){
                intersection[index] = A[i];
                index++;
            }
        }
        return intersection;
    }
    public static void intersectionTest(){
        int[] A = {1, 3, 4, 5, 6, 9, 12};
        int[] B = {2, 4, 6, 8, 10};
        int[] intersection = intersection(A, B);
        for(int i : intersection){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        intersectionTest();
    }
}
