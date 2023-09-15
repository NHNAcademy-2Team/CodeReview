package Unit3_Exercise;

import java.util.Scanner;

public class Exercise3_8 {

    public static void main(String[] args) {
        
        //Exercise 3.8
        //1. 첫번째 책에 대해 제목, 작가, 과목, 해당과목을 채택하는 학부 저장
        Scanner scan = new Scanner(System.in);
        System.out.print("Book1's title : ");
        String title = scan.nextLine();
        System.out.print("authors : ");
        String authors = scan.nextLine();
        System.out.print("course : ");
        String course = scan.nextLine();
        System.out.print("faculty : ");
        String faculty = scan.nextLine();

        //중복되는 코드 피하려면 for문도 괜찮을 듯
        // String[] bookList = new String[4];
        // for(int i=0; i<bookList.length; i++) {
        //     bookList[i] = scan.nextLine();
        // }
        // Book book1 = new FreeUniversityOfBolzano(bookList[0], bookList[1], bookList[2], bookList[3]);
        
        Book book1 = new FreeUniversityOfBolzano(title, authors, course, faculty);

        //2. 첫번째 책에 대한 정보 표시
        System.out.println(book1.toString());

        //3. 두번째 책에 대해 제목, 작가를 읽고 적절한 객체에 저장
        System.out.print("Book2's title : ");
        title = scan.nextLine();
        System.out.print("Book2's author : ");
        authors = scan.nextLine();
        Book book2 = new Book(title, authors);

        //4. 두번째 책의 주제를 읽고 소설 형식의 세번째 객체 생성
        //-> 주제..? type..?
        System.out.print("Book3's topic(type) : ");
        String type = scan.nextLine();
        Novels novels = new Novels(book2.getTitle(), book2.getAuthors(), type);

        //5. 두번째 책을 만드는데 사용된 두 개의 객체에 대한 정보 표시
        System.out.println(book2.toString());
        System.out.println(novels.toString());

        //6. 첫번째 책의 가격 업데이트
        System.out.print("Book1's price : ");
        int price = scan.nextInt();
        book1.setPrice(price);

        //7. 첫번째 책의 가격 포함 정보
        System.out.println(book1.toString());

        scan.close();
    }
    
}
