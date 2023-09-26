package unit.five;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean checkSameDate(Date date){
        return (this.day == date.day && this.month == date.month && this.year == date.year)? true : false;
    }

    public boolean checkEarlyDate(Date date){
        if(checkSameDate(date))
            throw new IllegalArgumentException("같은 날 입니다.");

        if(this.year != date.year)
            return (this.year < date.year)? true : false;
        else if(this.month != date.month)
            return (this.month < date.month)? true : false;
        else{
            return (this.day < date.day)? true : false;
        }
    }

    public static boolean checkleepYear(Date date){
        if ((date.year % 4 == 0 && date.year % 100 !=0) || date.year % 400 == 0)
            return true;

        return false;
    }

    public static Date nextDate(Date date){
        int[] monthArrays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(checkleepYear(date))
            monthArrays[1] = 29;

        if(date.day == monthArrays[date.month-1]){
            date.month += 1;
            date.day = 1;
        } else {
            date.day += 1;
        }
        return date;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
