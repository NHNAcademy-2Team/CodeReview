package unit.seven;

public class Exercise12 {
    public static void main(String[] args) {
        Apartment p = new Apartment(40, "nammunro 305");
        p.setApartment("Via della Camilluccia");
        p.setApartment("Largo di Torre Argentina");
        p.setApartment("P.zza Conca D'Oro");
        p.setApartment("Via del Corso");
        p.setApartment("Via Trionfale");

        System.out.println("Apartment 2: " + p.getApartment(2));


        System.out.println();
        p.reorganizeApartments();
        System.out.println(p);
    }
}
