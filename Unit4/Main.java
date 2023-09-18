public class Main {
    private static double exchangeRate = 0.035;

    public static double convertLireEuro(int x) {
        return x*exchangeRate;
    }

    public static boolean sumOverflow(byte x, byte y) {
        if((short)x+(short)y >= -128 && (short)x+(short)y <= 127) {
            return true;
        }
        return false;
    }

    public static char lastCharacter(String s) {
        return s.charAt(s.length()-1);
    }

    public static void main(String[] args) {
        short x = 22;
        byte y = (byte) x;
        System.out.println(y);

        /* Exercise 4.6
         * 1. long
         * 2. long
         * 3. float
         * 4. float
         * 5. boolean
         * 6. float
         * 7. boolean
         * 8. bollean
         * 9. boolean
         */

        /*
         * 
         * 1
         * 3번..
         * 4..
         * 5..
         * 6
         */

        /* Exercise 4.8
         * 100 200
         * 
         * 
         */

    }

}