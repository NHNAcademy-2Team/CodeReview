package Unit3_Exercise;

public class TextBook extends Book {

    private String course;

    public TextBook(String title, String authors) {
        super(title, authors);
    }

    public TextBook(String title, String authors, String course) {
        super(title, authors);
        this.course = course;
    }

    public String getCourse() {
        return this.course;
    }

    
}
