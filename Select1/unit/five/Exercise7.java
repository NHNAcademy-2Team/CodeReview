package unit.five;

public class Exercise7 {
    public static void main(String[] args) {
        Date date = new Date(2016, 12, 31);
        System.out.println("같은 날 테스트 : " + date.equalToDate(new Date(2018, 4, 16)));
        date.compareToDate(new Date(2018, 4, 19));
        date.compareToDate(new Date(2018, 3, 10));
        System.out.println(date.leapYear());
        System.out.println(date.nextDay());
    }
}
