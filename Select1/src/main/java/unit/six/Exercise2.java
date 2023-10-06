package unit.six;

public class Exercise2 {
    public static void evenNum(int n){
        int count = 0;
        int start = 1;
        while(count < n){
            if (start % 2 == 0) {
                System.out.print(start + " ");
                count++;
            }
            start++;
        }
    }

    public static void main(String[] args) {
        evenNum(5);
    }
}
