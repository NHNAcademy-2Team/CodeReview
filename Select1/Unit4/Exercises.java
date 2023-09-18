import javax.swing.JOptionPane;

public class Exercises{
    private static double exchangeRate = 0.035;

    public static double convertLireEuro(int x) {
        return x*exchangeRate;
    }

    public static boolean sumOverflow(byte x, byte y) {
        if(((short)x+(short)y >= -128) && ((short)x+(short)y <= 127)) {
            return true;
        }
        return false;
    }

    public static char lastCharacter(String s) {
        return s.charAt(s.length()-1);
    }

    public static double getAverage(int x, int y) {
        return (x+y)/2;
    }

    public static double getSquareRoot(int x) {
        return Math.sqrt(x);
    }

    public static String getCompare(int x, int y) {
        return (x>y) ? "x greater than y" : "y greater than x";
    }

    public static boolean even(long x) {
        return x%2==0;
    }

    public static void main(String[] args) {
        String numberX = JOptionPane.showInputDialog("Enter two integer number(x)");
        String numberY = JOptionPane.showInputDialog("Enter two integer number(y)");

        JOptionPane.showMessageDialog(null, "Average: " + getAverage(Integer.parseInt(numberX), Integer.parseInt(numberY)));
        JOptionPane.showMessageDialog(null, "Square Root(x): " + getSquareRoot(Integer.parseInt(numberX)*Integer.parseInt(numberX)));
        JOptionPane.showMessageDialog(null, "Square Root(y): " + getSquareRoot(Integer.parseInt(numberY)*Integer.parseInt(numberY)));
        JOptionPane.showMessageDialog(null, getCompare(Integer.parseInt(numberX), Integer.parseInt(numberY)));
    

        short x = 22;
        byte y = (byte) x;
        System.out.println(y);
        System.out.println(sumOverflow((byte)127, (byte)1));
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