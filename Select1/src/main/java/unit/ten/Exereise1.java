package unit.ten;
public class Exereise1 {
    public static void main(String[] args) {
        
    }

    public int fibonacci(int n) {
        int[] array = new int[n];
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        array[0] = 1;
        array[1] = 1;
        for (int i = 2 ; i < n ; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[n-1];
    }
}