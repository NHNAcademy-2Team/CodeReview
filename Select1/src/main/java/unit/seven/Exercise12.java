package unit.seven;

public class Exercise12 {
    public static void main(String[] args) {
        Apartment apt = new Apartment(20, "Seoul");


        apt.addPerson("Kim");
        apt.addPerson("Park");

        System.out.println(apt.getPerson(1));
        System.out.println(apt.getPerson(2));
        System.out.println(apt.getNumberOfPeople());
        System.out.println(apt.toString());

        apt.removePerson(0);
        System.out.println(apt.toString());

    }
}
