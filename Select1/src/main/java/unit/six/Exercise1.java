package unit.six;

public class Exercise1 {
    public static int min(int x, int y){
        if(x > y)
            return y;
        return x;
    }

    public static int minNum(int... x){
        int minNumber = x[0];
        for(int i = 1; i < x.length; i++){
            minNumber = min(minNumber, x[i]);
        }
        return minNumber;
    }

    public static void main(String[] args) {
        System.out.println(minNum(2, 3, 4, 5, 6, 7, 8, 20, 1, 34));
    }
}
