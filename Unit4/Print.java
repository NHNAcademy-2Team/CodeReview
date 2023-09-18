import javax.swing.JOptionPane;

public class Print{
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
    
    }
}