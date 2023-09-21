package unit.five;

public class Exercise7 {
    int year;
    int month;
    int day;

    public Exercise7(int a, int b, int c) {
        year = a;
        month = b;
        day = c;
    }

    public void today() {
        System.out.println(year + "년 " + month + "월 " + day + "일");
    }

    public void equal(Exercise7 x) {

        if (this.equals(x)) {
            System.out.println("날자가 같다.");
        } else {
            System.out.println("날자가 다르다.");
        }
    }

    public void fastDay(Exercise7 x) {
        if (year > x.year) {
            System.out.println("빠른날입니다.");
        } else if (year < x.year) {
            System.out.println("느린날입니다.");
        } else {
            if (month > x.month) {
                System.out.println("빠른날입니다.");
            } else if (month < x.month) {
                System.out.println("느린날입니다.");
            } else {
                if (day > x.day) {
                    System.out.println("빠른날입니다.");
                } else if (day < x.day) {
                    System.out.println("느린날입니다.");
                } else {
                    System.out.println("같은날입니다.");
                }
            }
        }
    }

    public void leapYear() {
        if (year % 4 == 0) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("평년입니다.");
        }
    }

    public void nextDay() {
        day++;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day > 31) {
                    month++;
                    day = 1;
                    break;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 30) {
                    month++;
                    day = 1;
                    break;
                }
            case 2:
                if (day > (year % 4 == 0 ? 29 : 28)) {
                    month++;
                    day = 1;
                }
        }
        if (month > 12) {
            year++;
            month = 1;
        }
        today();
    }
}
