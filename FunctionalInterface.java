interface InterestCalculator {
    double calculateInterest(double balance);
}

abstract class BankAccount {
    protected double balance;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public void applyInterest(InterestCalculator calculator) {
        double interest = calculator.calculateInterest(balance);
        balance += interest;
        System.out.println("Interest applied: " + interest);
    }
}

class SavingsAccount extends BankAccount {
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount();

        account.deposit(1000);
        account.applyInterest(balance -> balance * 0.05);

        System.out.println("Final balance: " + account.getBalance());
    }
}
