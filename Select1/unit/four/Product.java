package unit.four;

public class Product {
    // 창고에 저장된 특정 상품의 정보
    private String productName;
    private int productCount = 0;

    public Product() {

    }

    public void downLoad(int number) {
        productCount += number;
    }

    public void upLoad(int number) {
        productCount -= number;
    }

    @Override
    public String toString() {
        return "" + productCount;
    }
}
