public class Product {
    private String name;
    private int count;

    public Product(String name) {
        this.name = name;
        this.count = 0;
    }

    public void downLoad(int downLoad) {
        this.count += downLoad;
    }

    public void upLoad(int reduce) {
        this.count -= reduce;
    }

    public String toString() {
        return this.name + ", " + count + " pieces.";
    }
}
