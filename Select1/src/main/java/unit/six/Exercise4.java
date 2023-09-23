package unit.six;

import java.util.Scanner;

public class Exercise4 {
    public static int sum(int x, int y){
        return x + y;
    }
    public static void sumSequence(int n){
        Scanner sc = new Scanner(System.in);
        int result1 = 0;
        int result2 = 0;
        for(int i = 0; i < n; i++){
            int r = sc.nextInt();
            if(r > 0){
                result1 += r;
            }else{
                result2 += r;
            }
        }
        System.out.printf("양수의 합 : %d, 음수의 합 : %d", result1, result2);
    }

    public static void main(String[] args) {
        sumSequence(5);
    }
}
