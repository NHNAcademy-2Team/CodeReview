package unit3;

import javax.swing.JOptionPane;

public class Program1 {
    public static void printGreeting() {
        System.out.println("Good Morning");
    }

    public static void printPersonalGreeting(String firstName, String lastName) {
        System.out.print("Good Morning");
        System.out.print(firstName);
        System.out.print(" ");
        System.out.print(lastName);
        System.out.print("!");
    }

    public static void printInformalGreeting(String name) {
        System.out.println("Ciao " + name + "!");
    }

    public static String personalGreeting(String firstName, String lastName) {
        return "Good Morning " + firstName + " " + lastName + "!";
    }

    public static void main(String[] args) {
        printGreeting();
        String fn = JOptionPane.showInputDialog("First name");
        String ln = JOptionPane.showInputDialog("Last name");
        printPersonalGreeting(fn, ln);
        printInformalGreeting(fn);
        JOptionPane.showMessageDialog(null, personalGreeting(fn, ln));
    }
}
