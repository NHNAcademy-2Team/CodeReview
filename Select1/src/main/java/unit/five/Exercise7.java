package unit.five;

public class Exercise7 {
    private int day, month, year;
    private int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public Exercise7(int day, int month, int year) {
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
}
