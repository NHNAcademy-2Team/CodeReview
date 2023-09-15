package BookStore;
public class Book{
    private String title;
    private String authors;
    private int price;

    public Book(String title, String authors) {
        this.title = title;
        this.authors = authors;
    }

    public void printBook() {
        System.out.printf("Book title : %s", this.title);
        System.out.printf("Book authors : %s", this.authors);
    }

    public void printBookPrice() {
        System.out.printf("Book title : %s", this.title);
        System.out.printf("Book authors : %s", this.authors);
        System.out.printf("Book price : %d",this.price);
    }

    public void windowBook() {
        printBook();
        printBookPrice();
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthors() {
        return this.authors;
    }å

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}