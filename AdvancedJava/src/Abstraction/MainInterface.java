//An interface in Java is a blueprint of a class.The interface in Java is a mechanism to achieve abstraction. 
package Abstraction;

//An interface is declared by using the interface keyword.
interface Payment {
 // Abstract method to process payment
 void processPayment(double amount);

 // Abstract method to print payment receipt
 void printReceipt();
}

//Class CreditCardPayment implements the Payment interface
class CreditCardPayment implements Payment {
 private String cardNumber;

 public CreditCardPayment(String cardNumber) {
     this.cardNumber = cardNumber;
 }

 // Implementing the processPayment method
 public void processPayment(double amount) {
     System.out.println("Processing credit card payment of " + amount + " for card number " + cardNumber);
 }

 // Implementing the printReceipt method
 public void printReceipt() {
     System.out.println("Receipt: Credit card payment successful.");
 }
}

//Class PayPalPayment implements the Payment interface
class PayPalPayment implements Payment {
 private String email;

 public PayPalPayment(String email) {
     this.email = email;
 }

 // Implementing the processPayment method
 public void processPayment(double amount) {
     System.out.println("Processing PayPal payment of " + amount + " for email " + email);
 }

 // Implementing the printReceipt method
 public void printReceipt() {
     System.out.println("Receipt: PayPal payment successful.");
 }
}

public class MainInterface {

	 public static void main(String[] args) {
	        // Creating payment objects
	        Payment creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
	        Payment payPalPayment = new PayPalPayment("user@example.com");

	        // Processing payments and printing receipts
	        creditCardPayment.processPayment(150.00);
	        creditCardPayment.printReceipt();

	        System.out.println();

	        payPalPayment.processPayment(75.50);
	        payPalPayment.printReceipt();
	    }
}
