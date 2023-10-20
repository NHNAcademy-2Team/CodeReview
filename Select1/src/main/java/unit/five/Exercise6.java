package unit.five;

import javax.swing.JOptionPane;

public class Exercise6 {


    public static void answer(String s) {
        if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' ||
                s.charAt(0) == 'u') {
            System.out.println("MAYBE");
        } else if (s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'i' ||
                s.charAt(s.length() - 1) == 'u') {
            System.out.println("YES");
        } else if (s.charAt(s.length() - 1) == 'e' || s.charAt(s.length() - 1) == 'o') {
            System.out.println("NO");
        } else {
            System.out.println("DON'T KNOW");
        }

    }


    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Enter anything");
        answer(s);
    }
}