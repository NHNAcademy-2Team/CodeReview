package BookStore;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String title = s.nextLine();
        String authors = s.nextLine();

        Book book1 = new Book(title, authors);
        
        title = s.nextLine();
        authors = s.nextLine();
        Book book2 = new Book(title, authors);

        book1.windowBook();
        book2.windowBook();

        book1.setPrice(12000);
        book1.windowBook();

        s.close();
    }
}
