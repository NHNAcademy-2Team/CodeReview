package unit.ten;
public class Exereise3 {
    
    public static void main(String[] args) {
        
    }

    public int A(int m,int n) {
        if (m == 0) {
            return n+1;
        }
        if (n == 0) {
            return A(m-1,1);
        }
        return A(m - 1,A(m,n-1));
    }
}
