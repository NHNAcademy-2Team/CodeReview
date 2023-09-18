package Book;

import java.util.Scanner;

public class Client {
    public static Book createBook(Scanner sc){
        System.out.print("책의 제목과 책의 저자를 작성해주세요 : ");
        String bookTitle = sc.next();
        String bookAuthors = sc.next();
        if(bookTitle.isEmpty() || bookTitle == null){
            throw new IllegalArgumentException("제목이 없습니다.");
        }
        if(bookAuthors.isEmpty() || bookAuthors == null){
            throw new IllegalArgumentException("저자가 없습니다.");
        }
        return new Book(bookTitle, bookAuthors);
    }
    public static void updatePrice(Scanner sc, Book book){
        System.out.print("첫 번재 책의 가격을 입력해주세요 : ");
        int price = sc.nextInt();
        book.setPrice(price);
        book.printBookPrice();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Book book1 = createBook(sc);
            book1.printBook();
            Book book2 = createBook(sc);
            book2.printBook();

            updatePrice(sc, book1);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
