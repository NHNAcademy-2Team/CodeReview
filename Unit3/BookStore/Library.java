package BookStore;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String title = s.nextLine();
        String authors = s.nextLine();
        String course = s.nextLine();
        String professor = s.nextLine();

        TextBook book1 = new TextBook(title, authors, course, professor);
        book1.windowBook();

        Book book2 = new Book(title, authors);
        Novel book3 = new Novel(book2.getTitle(), book2.getAuthors());

        System.out.println("=============================");

        book1.printBookPrice();
        book1.setPrice(12000);
        System.out.println("book1's price is change.");
        book1.printBookPrice();
        // book1.windowBook();
        // book2.windowBook();

        // book1.setPrice(12000);
        // book1.windowBook();

        s.close();
    }
}
