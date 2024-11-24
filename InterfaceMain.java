interface Transaction {
   void execute();
}

class DepositTransaction implements Transaction {
   private final BankAccount account;
   private final double amount;

   // Constructor
   public DepositTransaction(BankAccount account, double amount) {
       this.account = account;
       this.amount = amount;
   }

   @Override
   public void execute() {
       account.deposit(amount);
       System.out.println("Deposited " + amount + " to account. New balance: " + account.getBalance());
   }
}

class WithdrawTransaction implements Transaction {
   private final BankAccount account;
   private final double amount;

   // Constructor
   public WithdrawTransaction(BankAccount account, double amount) {
       this.account = account;
       this.amount = amount;
   }

   @Override
   public void execute() {
       if (account.withdraw(amount)) {
           System.out.println("Withdrew " + amount + " from account. New balance: " + account.getBalance());
       } else {
           System.out.println("Failed to withdraw " + amount + ". Insufficient balance.");
       }
   }
}

class BankAccount {
   private final String accountNumber;
   private double balance;

   public BankAccount(String accountNumber, double initialBalance) {
       this.accountNumber = accountNumber;
       this.balance = initialBalance;
   }

   public void deposit(double amount) {
       balance += amount;
   }

   public boolean withdraw(double amount) {
       if (balance >= amount) {
           balance -= amount;
           return true;
       } else {
           return false;
       }
   }

   public double getBalance() {
       return balance;
   }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class InterfaceMain {
   public static void main(String[] args) {
     
       BankAccount account = new BankAccount("12345", 1000.0);

     
       Transaction deposit = new DepositTransaction(account, 500.0);
       Transaction withdraw = new WithdrawTransaction(account, 200.0);

       
       deposit.execute();
       withdraw.execute();

      
       Transaction overdraft = new WithdrawTransaction(account, 2000.0);
       overdraft.execute();
   }
}
