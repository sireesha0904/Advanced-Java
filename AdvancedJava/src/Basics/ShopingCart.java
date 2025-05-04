package Basics;
import java.util.Scanner;

//Shopping Cart Program
public class ShopingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String item;
		double price;
		int quantity;
		double total;
		
		System.out.print("What item would you like to buy ? ");
		item = sc.nextLine();
		
		System.out.print("What is the price for each ?");
		price = sc.nextDouble();
		
		System.out.print("How many would you like to have? ");
		quantity = sc.nextInt();
		
		
		total = price * quantity;
		System.out.println("You have bought "+ quantity + " "+ item + "/s");
		System.out.println("Your total is = "+total + "Rs.");
	}
}
