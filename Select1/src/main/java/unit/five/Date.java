package unit.five;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equalToDate(Date date) {
        if (this.day == date.getDay() && this.month == date.getMonth() && this.year == date.getYear())
            return true;
        return false;
    }

    public String toString() {
        return String.format("연도 : %d, 월 : %d, 일 : %d", this.year, this.month, this.day);
    }

    public void compareToDate(Date date) {
        if (this.year > date.getYear()) {
            System.out.println("날짜가 뒤에 있습니다.");
        }else if(this.year == date.getYear() && this.month > date.getMonth()){
            System.out.println("날짜가 뒤에 있습니다.");
        }else if(this.year == date.getYear() && this.month == date.getMonth() && this.day > date.getMonth()){
            System.out.println("날짜가 뒤에 있습니다.");
        }else{
            System.out.println("날짜가 앞에 있습니다.");
        }
    }

    public boolean leapYear() {
        int year = this.year;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        return false;
    }

    public String nextDay() {
        int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysInLeapMonth  = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int nextDay = this.day;
        int nextMonth = this.month;
        int nextYear = this.year;
        boolean isLeapYear = leapYear();
        if(isLeapYear){
            if(this.day + 1 <= daysInLeapMonth[this.month-1]){
                nextDay += 1;
            }else{
                if(nextMonth + 1 < 13){
                    nextDay = 1;
                    nextMonth += 1;
                }else{
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear += 1;
                }
            }
        }else{
            if(this.day + 1 <= daysInMonth[this.month]){
                nextDay += 1;
            }else{
                if(nextMonth + 1 < 13){
                    nextDay = 1;
                    nextMonth += 1;
                }else{
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear += 1;
                }
            }
        }
        return String.format("연도 : %d, 월 : %d, 일 : %d", nextYear, nextMonth, nextDay);
    }
}