package unit.six;

public class Exercise8 {
    public static void multiplication(int n){
        for(int i = 2; i <= n; i++){
            for(int j = 1; j < 10; j++){
                if(i * j < 10){
                    System.out.print("  " + i * j + " ");
                }else if(i * j < 100){
                    System.out.print(" " + i * j + " ");
                }else{
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        multiplication(3);
    }
}
