package unit.three.book;

public class UniversityTextBook extends TextBook{
    private String faculty;

    public UniversityTextBook(String title, String authors, String course, String faculty){
        super(title, authors, course);
        this.faculty = faculty;
    }

    public String toString(){
        return super.toString() + ", 강의 : " + this.faculty;
    }
}
