// Exercise 03.1

import javax.swing.JOptionPane;

public class Book {

    private String title;
    private String authors;
    private int price;

    public Book(String title, String authors) {
        this.title = title;
        this.authors = authors;
        this.price = 0;
    }

    public void printBook() {
        System.out.println("title : " + this.title + "\nauthors : " + this.authors);
    }

    public void printBookPrice() {
        printBook();
        System.out.println("price : " + this.price);
    }

    public void windowBook() {
        String stringToShow = "title : " + this.title + "\nauthors : " + this.authors;
        JOptionPane.showMessageDialog(null, stringToShow);
        System.exit(0);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthors() {
        return this.authors;
    }

    public int getPrice() {
        return this.price;
    }
}
