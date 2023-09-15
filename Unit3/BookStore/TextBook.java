package BookStore;

public class TextBook extends Book{
    private String course;
    private String professor;

    public TextBook(String title, String author, String course, String professor) {
        super(title, author);
        this.course = course;
        this.professor = professor;
    }
    
    public void printCourse() {
        System.out.printf("collage : %s\n", this.course);
        System.out.printf("professor : %s\n", this.professor);        
    }

    public String getCourse() {
        return this.course;
    }

    public String getProfessor() {
        return this.professor;
    }

    public void windowBook() {
        printBook();
        printCourse();
        printBookPrice();
    }


}
