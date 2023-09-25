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
        int[] tmp = new int[Math.min(A.length, B.length)];

        int j = 0;
        for (int i = 0; i < A.length; i++) {
            for (int k = 0; k < B.length; k++) {
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

    public static void printArray(int[] M) {
        for(int i = 0;i<M.length;i++) {
            System.out.print(M[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] A = { 1,2,3,4,0,6};
        int[] B = { 2,4,8,3,0,5};

        int[] result = intersection(A, B);

        printArray(result);
    }
}
