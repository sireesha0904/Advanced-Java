package String;

public class SubStrings {

	public static void main(String[] args) {
		
		String email = "modisireesha09@gmail.com";
		
		String username = email.substring(0,12);
		String host = email.substring(15);
		
		
		System.out.println("User name : "+ username);
		System.out.println("Host name : "+ host);
		
	}
}
