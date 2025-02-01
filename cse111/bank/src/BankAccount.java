public class BankAccount {
    private int number;
    private int balance;
    private String name;

    public BankAccount(int number, int balance, String name) {
        this.number = number;
        this.balance = balance;
        this.name = name;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("Stop. You are already broke man.");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance + "$");
    }
}
