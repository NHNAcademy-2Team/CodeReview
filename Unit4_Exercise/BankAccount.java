package Unit4_Exercise;

import java.math.BigDecimal;

public class BankAccount {

    private String nameOfOwner;
    private String surnameOfOwner;
    private double balance;

    public BankAccount(String nameOfOwner, String surnameOfOwner) {
        this.nameOfOwner = nameOfOwner;
        this.surnameOfOwner = surnameOfOwner;
        this.balance = 0.0;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public double withdraw(double money) {
        if (this.balance >= money) {
            this.balance -= money;
        } 
        
        return this.balance;
     }

     public String toString() {
        return String.format("Owner : %s. Balance : %s", this.nameOfOwner + " " + this.surnameOfOwner, this.balance);
     }
    
}
