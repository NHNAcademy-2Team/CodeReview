public class Product {
    private String name;
    private int number;

    public Product(String name){
        this.name = name;
        this.number = 0;
    }

    public void downLoad(int n){
        this.number += n;
    }

    public void upLoad(int n){
        this.number -= n;
    }

    public String toString(){
        return String.format("%s, %d pieces", name, number);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
