// 04.9
public class Product {
    private String name;
    private int item;

    public Product(String name) {
        this.name = name;
        this.item = 0;
    }

    public void downLoad(int number) {
        item += number;
    }

    public void upLoad(int number) {
        item -= number;
    }

    public String toString() {
        return name + " " + item + "개";
    }
}
