package Unit4_Exercise;

//4.9
public class TestProduct {

    public static void main(String[] args) {
        
        Product lamp = new Product("Lamp 60 Watt");
        System.out.println("Before the loading : " + lamp);
        lamp.downLoad(1000);
        lamp.upLoad(100);
        System.out.println("After the loading : " + lamp);
    }
    
}

class Product {
    private String name;
    private int amount;

    public Product(String name) {
        this.name = name;
        this.amount = 0;
    }

    public void downLoad(int amount) {
        this.amount += amount;
    }

    public void upLoad(int amount) {
        this.amount -= amount;
    }

    public String toString() {
        return String.format("%s, %d pieces", this.name, this.amount);
    }
}
