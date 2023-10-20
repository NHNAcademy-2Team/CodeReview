package unit.ten;
public class Exereise4 {
    

    public int gcd(int x, int y) {
        if (x < y) {
            return gcd(y, x);
        }
        if (y == 0) {
            return x;
        } else {
            // x = q * y + r -> x - (q * y) = r
            // gcd(y,r);;;
            // r = 0일때
            // x = q * y -> x/y = q
            // q는 공약수 r은 나머지
            // r = x/y의 나머지
            return gcd(y, y%x);
        }
    }
    
    public boolean prime(int x,int y) {
        if (x == 1 || y == 1) {
            return true;
        }
        if (x == y) {
            return false;
        }
        if (x < y) {
            return prime(x, y-x);
        }
        if (x > y) {
            return prime(x-y, y);
        }
        return prime(x, y);
    }

    public int rest(int x, int y) { // x는 정수 , y는 양의 정수
        if (x < 0) {
            return rest(x + y, y);
        }
        // if (x < y) {
        //     return x;
        // }
        if (x > y) {
            return rest(x - y,y);
        }
        return x;
    }
}
