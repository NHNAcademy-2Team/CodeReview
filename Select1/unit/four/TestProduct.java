package unit.four;

public class TestProduct {
    public static void main(String[] args) {
        Product lamp = new Product();
        System.out.println("Before the loading: " + lamp);
        lamp.downLoad(1000);
        lamp.upLoad(100);
        System.out.println("After the loading: " + lamp);

    }
}
