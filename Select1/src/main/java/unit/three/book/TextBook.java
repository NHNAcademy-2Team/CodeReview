package unit.three.book;

public class TextBook extends Book{
    private String course;

    public TextBook(String title, String authors, String course){
        super(title, authors);
        this.course = course;
    }

    public String getCourse(){
        return this.course;
    }

    public String toString(){
        return super.toString() + ", 강좌 : " + this.course;
    }
}