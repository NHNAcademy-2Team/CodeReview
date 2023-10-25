package chapter.two.exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("Please enter your first name and last name, separated by a space.");
        String inputLine = TextIO.getln();
        int indexSpace = inputLine.indexOf(" ");
        String firstName = inputLine.substring(0, indexSpace);
        String lastName = inputLine.substring(indexSpace + 1);
        System.out.printf("Your first name is %s, which has %d characters%n", firstName, firstName.length());
        System.out.printf("Your last name is %s, which has %d characters%n", lastName, lastName.length());
        System.out.printf("Your initials are %c%c%n", firstName.charAt(0), lastName.charAt(0));
    }
}
