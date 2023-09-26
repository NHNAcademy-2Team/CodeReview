package unit.seven;
public class Exercise12 {
    /**
     *
     * Exercise 07.12 Realize a Java class Apartment, whose objects maintain the following information: an integer that
     * indicates the size in square meters of the apartment, the address, and a list of maximal 10 names of persons that
     * live in the apartment. Each person living in the apartment has an associated number between 0 and the number
     * of persons currently living in the apartment minus 1. The class should export the following functionalities:
     *
     * https://www.inf.unibz.it/~calvanese/teaching/04-05-ip/lecture-notes/uni07/node24.html
     * */

    public static void main(String[] args) {
        Apartment apartment = new Apartment(100, "조선대학교");

        apartment.setPeople("홍길동");
        apartment.setPeople("김철수");
        apartment.setPeople("고봉민");

        System.out.println("2번지에 사는 사람 : " + apartment.houseOwner(2));

        apartment.removePeople(1);

        System.out.println("\n아파트 정보\n--------------------");
        System.out.println(apartment);
    }
}
