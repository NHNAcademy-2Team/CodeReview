package unit2;

import javax.swing.JOptionPane;

public class OutputWindow {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        name = name.toUpperCase();

        String stringToShow = "Hi " + name + ", how are you?";
        JOptionPane.showMessageDialog(null, stringToShow);
    }
}
