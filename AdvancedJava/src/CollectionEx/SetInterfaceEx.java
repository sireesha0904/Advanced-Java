package CollectionEx;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterfaceEx {

	public static void main(String[] args) {
		
		Set <String> cart = new LinkedHashSet<>();
		
		cart.add("SmartPhone");
		cart.add("Laptop");
		cart.add("HeadPhone");
		cart.add("Smartwatch");
		cart.add("SmartPhone"); // duplicate will be ignored
		
		System.out.println("Items in a Cart : "+cart);
		
		// check if items exits 
		
		System.out.println("Is 'Laptop' in the cart? : "+cart.contains("Laptop"));
		System.out.println("Is 'Tablet' in the cart? : " + cart.contains("Tablet"));
		
		// Removing an item
		  System.out.println("\nRemoving 'Smartwatch' from cart...");
	      cart.remove("Smartwatch");

		System.out.println("Items in cart : "+cart);
		
		  // Count
        System.out.println("\nTotal unique items in cart: " + cart.size());
        
        // Clear cart
        cart.clear();
        System.out.print("\nCart is cleared - Empty - "+cart.isEmpty());

	}
}
