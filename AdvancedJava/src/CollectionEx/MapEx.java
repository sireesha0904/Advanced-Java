package CollectionEx;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		
		Map<String, String> country = new HashMap<>();
		
		// Add Elements
		country.put("India", "New Delhi");
		country.put("USA", "Washington DC");
		country.put("France", "Paris");
		
		//Access values
		System.out.println("Captial of India : "+country.get("India"));
		System.out.println(country.entrySet());
		
		System.out.println("Has Japan? " + country.containsKey("Japan"));
	}
}
