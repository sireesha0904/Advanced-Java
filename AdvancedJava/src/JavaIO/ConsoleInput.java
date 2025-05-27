package JavaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

	public static void main(String[] args) throws IOException  {
		
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inp);
		
		String name;
		System.out.print("Enter Your name here : ");
		name = reader.readLine();
		
		System.out.println("Hello "+name);
	}
}
