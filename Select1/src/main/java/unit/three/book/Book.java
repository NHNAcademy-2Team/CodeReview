package unit.three.book;

public class Book{
    private String title;
    private String authors;
    private int price;

    public Book(String title, String authors){
        this.title = title;
        this.authors = authors;
        this.price = 0;
    }

    public void printBook(){
        System.out.println(this.title);
        System.out.println(this.authors);
    }

    public void printBookPrice(){
        System.out.println("제목 : " + this.title + ", 저자 : " + this.authors + ", 가격 : " + this.price);
    }

    public void windowBook(){
        System.out.println(this.title);
        System.out.println(this.authors);
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthors(){
        return this.authors;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String toString(){
        return "제목 : " + this.title + ", 저자 : " + this.authors + ", 가격 : " + this.price;
    }
}


