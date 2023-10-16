package unit.eight;

import java.math.BigDecimal;

public class BankAccount {
    private String name;
    private String surname;
    private BigDecimal balance; // Euro

    public BankAccount(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.balance = BigDecimal.valueOf(0);
    }
    public void deposit(int money) {
        this.balance = this.balance.add(BigDecimal.valueOf(money));
    }

    public void withdraw(int money) {
        this.balance = this.balance.subtract(BigDecimal.valueOf(money));
    }

    public String toString() {
        return this.name +" " + this.surname +
                ", " + this.balance + "(Euro)";
    }

    public boolean sameOwner(BankAccount account) {
        return (this.name.equals(account.name)) && (this.surname.equals(account.surname));
    }

    public void transferTo(BankAccount account, int money) {
        BigDecimal temp = BigDecimal.valueOf(money);
        this.balance = this.balance.subtract(temp);
        account.transferFrom(temp);
    }

    private void transferFrom(BigDecimal money) {
        this.balance = this.balance.add(money);
        System.out.println("이체 완료");
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Mario", "Rossi");
        BankAccount ba2 = new BankAccount("Carla", "Verdi");
        BankAccount ba3 = new BankAccount("Carla", "Verdi");
        System.out.println("Do ba1 and ba2 have the same owner? " +
                ba1.sameOwner(ba2));
        System.out.println("Do ba2 and ba3 have the same owner? " +
                ba2.sameOwner(ba3));
        ba1.deposit(1000);
        ba2.deposit(500);
        ba3.deposit(750);
        System.out.println("Before the transfer ...");
        System.out.println(ba1);
        System.out.println(ba2);
        ba1.transferTo(ba2, 250);
        System.out.println("After the transfer...");
        System.out.println(ba1);
        System.out.println(ba2);    }
}
