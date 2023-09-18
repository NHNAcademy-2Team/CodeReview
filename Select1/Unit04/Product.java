package Select1.Unit04;

public class Product {

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
