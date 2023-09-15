package BookStore;

public class Novel extends Book{
    private String genre;

    // public Novel(Book book) {
        
    // }

    public Novel(String title, String authors) {
        super(title, authors);
        this.genre = "criminal case";
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void printGenre() {
        System.out.printf("Book genre : %s\n", this.genre) ;
    }

    public void windowBook() {
        printBook();
        printGenre();
        printBookPrice();
    }
}
