package Unit3_Exercise;

public class Novels extends Book {
    
    private String type;

    public Novels(String title, String authors) {
        super(title, authors);
    }

    public Novels(String title, String authors, String type) {
        super(title, authors);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return String.format("%s, %s, %s", this.getTitle(), this.getAuthors(), this.type);
    }
    
}
