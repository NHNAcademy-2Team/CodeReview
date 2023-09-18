public class Product {
    private String name;
    private int productCount;

    public Product(String name){
        this.name = name;
        this.productCount = 0;
    }

    public void downLoad(int productCount){
        this.productCount += productCount;
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
