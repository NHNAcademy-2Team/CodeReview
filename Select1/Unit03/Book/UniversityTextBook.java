package Book;

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
// public class UniversityTextBook{
//     private TextBook textBook;
//     private String faculty;

//     public UniversityTextBook(TextBook textBook, String faculty){
//         this.textBook = textBook;
//         this.faculty = faculty;
//     }
// }
