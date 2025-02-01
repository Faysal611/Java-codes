public class Main {
    public static void main(String[] args) throws Exception {
        BankAccount myAcc = new BankAccount(12045, 700, "Faysal");
        myAcc.checkBalance();
        myAcc.deposit(300);
        myAcc.checkBalance();
        myAcc.withdraw(1000);
        myAcc.checkBalance();
        myAcc.withdraw(100);
    }
}
