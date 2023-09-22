package unit.seven;

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
