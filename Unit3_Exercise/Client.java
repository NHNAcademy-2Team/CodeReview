package Unit3_Exercise;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        //Exercise 3.2
        //1. 첫번째 책의 제목과 저자를 읽어와 개체 생성
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 책 이름을 입력하십시오 : ");
        String title = scan.nextLine();
        System.out.print("첫번째 책의 저자를 입력하십시오 : ");
        String author = scan.nextLine();
        
        Book book1 = new Book(title, author);

        //2. 두번째 책의 제목과 저자를 읽어와 개체 생성
        System.out.print("두번째 책 이름을 입력하십시오 : ");
        title = scan.nextLine();
        System.out.print("두번째 책의 저자를 입력하십시오 : ");
        author = scan.nextLine();

        Book book2 = new Book(title, author);

        //3, 4. 첫번째 책, 두번째 책의 정보 출력
        System.out.println(book1.printBook());
        System.out.println(book2.printBook());

        //5. 첫번째 책의 가격을 객체에 업데이트
        System.out.print("첫번째 책의 가격을 입력하시오 : ");
        int price = scan.nextInt();
        book1.setPrice(price);

        //6. 첫번째 책의 정보를 가격 포함하여 출력
        System.out.println(book1.printBookPrice());


    }
    
}
