package unit.five;

class Date {
    private int year;
    private int month;
    private int day;

    public Date(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getDate() {
        return String.format("%s/%s/%s", this.day, this.month, this.year);
    }
}
