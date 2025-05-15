package Encapsulation;

class BankAccount {
	private String Holdername;
	private int balance;
	
	
//	BankAccount(String name, int InitialBalace){
//		this.Holdername = name;
//		this.balance = InitialBalace;
//	}
	
	public String getName() {
		return Holdername;
	}
	
	public void setName(String name) {
		this.Holdername = name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBal(int bal) {
		this.balance = bal;
	}
	
	public void deposit(double amount ) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
	
}
public class Bank {

	public static void main(String[] args) {
//		BankAccount amo = new BankAccount("Modi Sireesha", 5000);
		BankAccount amo = new BankAccount();
		amo.setName("Sireesha");
		amo.setBal(10000);
		
		
		System.out.println(amo.getName() + " your balance is : "+amo.getBalance());
		
		amo.deposit(4500);
		System.out.println(amo.getName() + " your balance is After deposit : "+amo.getBalance());
		
		amo.withdraw(750);
		System.out.println(amo.getName() + " your balance is  After withdraw ammount : "+amo.getBalance());
		
		
	}
}
