/*it refers to the process of hiding the complex implementation details of an object and showing only the essential 
features or functionalities to the user. */

// using Abstract Classes

package Abstraction;

//Abstract class BankAccount
abstract class BankAccount {
 private String accountHolderName;
 private double balance;

 // Constructor to initialize account holder name and balance
 public BankAccount(String accountHolderName, double balance) {
     this.accountHolderName = accountHolderName;
     this.balance = balance;
 }

 // Abstract method to define how interest is calculated
 public abstract void calculateInterest();

 // Concrete method to deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     }
 }

 // Concrete method to withdraw money
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }

 // Display account info (this method can be inherited)
 public void displayAccountInfo() {
     System.out.println("Account Holder: " + accountHolderName);
     System.out.println("Current Balance: " + balance);
 }
}

//CheckingAccount class extends the abstract class BankAccount
class CheckingAccount extends BankAccount {
 private double overdraftLimit;

 public CheckingAccount(String accountHolderName, double balance, double overdraftLimit) {
     super(accountHolderName, balance);
     this.overdraftLimit = overdraftLimit;
 }

 // Implement the abstract method for interest calculation
 public void calculateInterest() {
     System.out.println("No interest for checking accounts.");
 }

 public double getOverdraftLimit() {
     return overdraftLimit;
 }
}

//SavingsAccount class extends the abstract class BankAccount
class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(String accountHolderName, double balance, double interestRate) {
     super(accountHolderName, balance);
     this.interestRate = interestRate;
 }

 // Implement the abstract method for interest calculation
 public void calculateInterest() {
     double interest = getBalance() * (interestRate / 100);
     System.out.println("Interest calculated: " + interest);
 }
}

//Main class
public class MainAbstract {

	public static void main(String[] args) {
        // Creating CheckingAccount and SavingsAccount objects
        CheckingAccount checking = new CheckingAccount("John Doe", 2000.0, 500.0);
        SavingsAccount savings = new SavingsAccount("Jane Smith", 3000.0, 2.5);

        // Display account information and calculate interest
        checking.displayAccountInfo();
        checking.calculateInterest();
        checking.deposit(500);
        checking.withdraw(2500);

        System.out.println();

        savings.displayAccountInfo();
        savings.calculateInterest();
        savings.deposit(1000);
        savings.withdraw(500);
    }
}
