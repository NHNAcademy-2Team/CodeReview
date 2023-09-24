package unit.seven;

public class Exercise2 {
    /**
     *
     * Exercise 07.2 Write a method static int[] intersection(int[] A, int[] B) that returns a new array containing the intersection
     * of two arrays A and B, i.e., exactly those elements that are present both in A and in B (independently of their position).
     * We may assume that A and B do not contain duplicates, i.e., elements that appear more than once in the array.
     * */

    static int[] intersection(int[] a, int[] b){
        int[] arrays = new int[Math.min(a.length, b.length)];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]){
                    arrays[index] = b[j];
                    index++;
                }
            }
        }
        return arrays;
    }

    static void printArrays(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != '\0') {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 8, 2, 7, 15};
        int[] b = {6, 8, 10, 1, 20, 17};

        printArrays(intersection(a, b));
    }
}
