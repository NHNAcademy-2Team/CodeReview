package Unit3_Exercise;

public class FreeUniversityOfBolzano extends TextBook {
    
    private String faculty;

    public FreeUniversityOfBolzano(String title, String authors) {
        super(title, authors);
    }

    public FreeUniversityOfBolzano(String title, String authors, String course, String faculty) {
        super(title, authors, course);
        this.faculty = faculty;
    }

    public String toString() {
        return String.format("%s, %s, %s, %s", this.getTitle(), this.getAuthors(), this.getCourse(), this.faculty);
    }

}
