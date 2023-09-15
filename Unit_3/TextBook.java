// Exercise 03.7

public class TextBook extends Book {

    private String lecture;
    private String faculty;

    public TextBook(String title, String authors, String lecture, String faculty) {
        super(title, authors);
        this.lecture = lecture;
        this.faculty = faculty;
    }

    public void printTextBook() {
        printBook();
        System.out.println("lecture : " + this.lecture + "\nfaculty : " + this.faculty);
    }
}
