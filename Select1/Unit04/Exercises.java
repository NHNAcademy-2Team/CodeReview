public class Exercises{
    /**
     * 
     * Exercise 04.1
     * 
     */
    public static double convertLireEuro(int x){
        final double exchangeRate = 0.03d;
        return exchangeRate * x;
    }

    /**
     * 
     * Exercise 04.2
     * 
     */
    public static boolean sumOverflow(byte x, byte y){
        short shortX = x;
        short shortY = y;
        int s = shortX + shortY;
        return (-128 <= s) && (s <= 127);
    }

    /**
     * 
     * Exercise 04.3
     * 
     */
    public static void useMath(int x, int y){
        System.out.println((x + y) / 2);
        System.out.println(Math.sqrt(x * y));
        System.out.println("큰 숫자 : " + Math.max(x, y) + ", 작은 숫자 : " + Math.min(x, y));
    }

    /**
     * 
     * Exercise 04.4
     * 
     */
    public static boolean even(long x){
        return x % 2 == 0;
    }

    /**
     * 
     * Exercise 04.5
     * 
     */
    public static void casting(){
        short x = 22;
        byte y = (byte)x;
        System.out.println(y);
    }

    /**
     * 
     * Exercise 04.6
     * b+10L => Long
     * (b+i)*l => Long
     * (b+i)*l+f => Float
     * s/f + Math.sin(f) => Float
     * c == 'b' => Boolean
     * l+1.5f => Float
     * i<10 => Boolean
     * b1 == (f >= 5.0) => Boolean
     * b1 && !b2 => Boolean
     */

    /**
     * 
     * Exercise 04.7    
     * s = 65L; => 오류
     * f = i+100;
     * i = 2*b + l; => 오류
     * b1 = s; => 오류
     * b2 = s >= 57; => 오류
     * c = b;
     * c = 'b';
     */

    /**
     * 
     * Exercise 04.9   
     * 
     */
    public static char lastCharacter(String s){
        char last = s.charAt(s.length()-1);
        return last;
    }
    public static void main(String[] args) {
        System.out.println(convertLireEuro(100));
        System.out.println(sumOverflow((byte)0, (byte)128));
        useMath(3, 4);
        System.out.println(even(4));
        casting();
        System.out.println(lastCharacter("string"));
    }
}