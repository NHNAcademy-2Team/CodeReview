package unit.five;

import static unit.five.Date.nextDate;

public class Exercise7 {
    public static void main(String[] args) {
        Date today = new Date(24, 9, 2023);
        Date tomorrow = new Date(25, 9, 2023);

        System.out.println("현재가 더 빠른 날짜 인가요? : " + today.checkEarlyDate(tomorrow));

        today = nextDate(today);
        System.out.println("다음 날짜 : " + today.getDay() + "-" + today.getMonth() + "-" + today.getYear());
    }
}
