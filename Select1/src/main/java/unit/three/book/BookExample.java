package unit.three.book;

public class BookExample {
    public static void main(String[] args) {
        Book book1 = new UniversityTextBook("모던 자바 인 액션", "라올-게이브리얼 우르마", "자바", "우정은");
        System.out.println(book1.toString());

        Book book2 = new Book("함수형 프로그래밍", "저자");
        System.out.println(book2.toString());

        Novel book3 = new Novel(book2, "프로그래밍");
        System.out.println(book3.toString());

        System.out.println(book1.getPrice());
        book1.setPrice(23000);
        System.out.println(book1.toString());
    }
}