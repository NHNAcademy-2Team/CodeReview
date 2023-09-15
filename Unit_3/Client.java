import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void printList(ArrayList<Book> name) {
        for (int i = 0; i < name.size(); i++) {
            System.out.println("------------------\n" + (i + 1) + "번째 책");
            name.get(i).printBook();
        }
        System.out.println("------------------\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * 
         * Exercise 03.2
         */

        ArrayList<Book> bookList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String title = scanner.next();
            String authors = scanner.next();

            bookList.add(new Book(title, authors));
        }
        printList(bookList);

        /*
         * 
         * Exercise 03.5
         */

        scanner.nextLine();
        String senderNum = "010-1234-5678";
        String message = scanner.nextLine();
        String recipientNum = scanner.next();

        Message msg = new Message(new MessageText(message), senderNum, recipientNum);
        msg.printMessage();

        /*
         * 
         * Exercise 03.6
         * Scanner 사용, 코드 수정
         */

        /*
         * 
         * Exercise 03.8
         */

        String[] bookInformation = new String[4];
        System.out.print("교과서 정보를 입력하세요(title authors lecture faculty) : ");
        for (int i = 0; i < 4; i++) {
            bookInformation[i] = scanner.next();
        }
        TextBook textBook = new TextBook(bookInformation[0], bookInformation[1], bookInformation[2],
                bookInformation[3]);
        textBook.printTextBook();

        String[] novelInformation = new String[3];
        System.out.print("소설 정보를 입력하세요(title authors type) : ");
        for (int i = 0; i < 3; i++) {
            novelInformation[i] = scanner.next();
        }
        Book novelBook = new Book(novelInformation[0], novelInformation[1]);
        Novel novel = new Novel(novelBook.getTitle(), novelBook.getAuthors(), novelInformation[2]);
        novel.printNovel();

        System.out.print("가격을 입력하세요 : ");
        int textBookPrice = scanner.nextInt();
        textBook.setPrice(textBookPrice);
        textBook.printTextBook();
        System.out.println("price : " + textBook.getPrice());

        scanner.close();

    }
}
