package Book;

public class Novel{
    private Book book;
    private String type;

    public Novel(Book book, String type){
        this.book = book;
        this.type = type;
    }

    public String toString(){
        return this.book + ", 유형 : " + this.type;
    }
}
