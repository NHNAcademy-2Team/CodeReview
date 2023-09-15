// Exercise 03.7

public class Novel extends Book {

    private String type;

    public Novel(String title, String authors, String type) {
        super(title, authors);
        this.type = type;
    }

    public void printNovel() {
        printBook();
        System.out.println("type : " + getType());
    }

    public String getType() {
        return this.type;
    }
}
