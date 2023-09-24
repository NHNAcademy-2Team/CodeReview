package unit.seven;

public class Exercise8 {
    /**
     *
     * Exercise 07.8 What does the following method calculate?
     * */

    public static int mystery(int[] array){
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 1)
                x++;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 5, 5, 9, 7, 9};
        System.out.println(mystery(array));
    }
}
