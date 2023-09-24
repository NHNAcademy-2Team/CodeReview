package unit.seven;


/*
 * Exercise7.2
 * Write a method static int[] intersection(int[] A, int[] B)
 * that returns a new array containing the intersection of two arrays A and B,
 * i.e., exactly those elements that are present both in A and in B (independently of their position).
 *
 * We may assume that A and B do not contain duplicates,
 * i.e., elements that appear more than once in the array.
 */
public class Exercise2 {
    public static int[] intersection(int[] A, int[] B) {
        int[] tmp;
        int maxLength;
        if (A.length <= B.length) {
            tmp = new int[A.length];
            maxLength = B.length;
        } else {
            tmp = new int[B.length];
            maxLength = A.length;
        }

        int j = 0;
        for (int i = 0; i < tmp.length; i++) {
            for (int k = 0; k < maxLength; k++) {
                if (A[i] == B[k]) {
                    tmp[j++] = A[i];
                }
            }
        }

        int[] result = new int[j];
        for(int i = 0;i<j;i++) {
            result[i] = tmp[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] A = { 1,2,3,4,5,6};
        int[] B = { 2,4,8,3,1,5};

        int[] result = intersection(A, B);

        for(int i = 0;i<result.length;i++) {
            System.out.printf("%d ", result[i]);
        }
    }
}
