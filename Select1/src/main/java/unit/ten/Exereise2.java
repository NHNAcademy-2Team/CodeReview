package unit.ten;
public class Exereise2 {
    
    public static void main(String[] args) {
        
    }

    public int fibonacci(int n) {
        switch(n) {
            case 1 : case 2 :
            return 1;
            default :
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
