abstract class BankAccount {

    protected double balance;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount();

   
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

      
        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());

     
        account.withdraw(400);
        System.out.println("Final Balance: " + account.getBalance());
    }
}
