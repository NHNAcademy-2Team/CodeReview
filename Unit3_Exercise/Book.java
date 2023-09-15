package Unit3_Exercise;

public class Book {

    //책 관련 정보 처리
    //제목, 저자, 가격
    //Exercise 3.1
    private String title;
    private String authors;
    private int price;

    public Book(String title, String authors) {
        this.title = title;
        this.authors = authors;
        this.price = 0;
    }    

    public String printBook() {
        return String.format("책 이름 : %s\n저자명 : %s", this.title, this.authors);
    }

    public String printBookPrice() {
        return String.format("%s, %s, %d\r\n", this.title, this.authors, this.price);
    }

    //windowBook이 뭐지...

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

    public String toString() {
        return String.format("%s, %s, %d", this.title, this.authors, this.price);
    }
}
