public class Product {
    // 창고에 저장된 특정 상품의 정보
    private String productName;
    private int productCount = 0;
    private String name;
    private int number;

    public Product(String name){
        this.name = name;
        this.number = 0;
    public Product() {

    }

    public void downLoad(int number) {
        productCount += number;
    public void downLoad(int n){
        this.number += n;
    }

    public void upLoad(int productCount){
        this.productCount -= productCount;
    }

    public String toString(){
        return String.format("%s, %d pieces", name, productCount);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
