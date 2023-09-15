package BookStore;
public class Book{
    private String title;
    private String authors;
    private int price;

    public Book() {
        this("Unknown", "Unknown");
    }

    public Book(String title, String authors) {
        this.title = title;
        this.authors = authors;
        this.price = 10000;
    }

    public void printBook() {
        System.out.printf("Book title : %s\n", this.title);
        System.out.printf("Book authors : %s\n", this.authors);
    }

    public void printBookPrice() {
        // System.out.printf("Book title : %s\n", this.title);
        // System.out.printf("Book authors : %s\n", this.authors);
        System.out.printf("Book price : %d\n",this.price);
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
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}