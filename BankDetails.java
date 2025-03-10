abstract class BankAccount {
    protected double balance;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}
public class BankDetails {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000.0);
        savingsAccount.displayBalance();
        savingsAccount.withdraw(500.0);
        savingsAccount.displayBalance();
        savingsAccount.deposit(-100.0);
        savingsAccount.withdraw(2000.0);
        savingsAccount.displayBalance();
    }
} 

