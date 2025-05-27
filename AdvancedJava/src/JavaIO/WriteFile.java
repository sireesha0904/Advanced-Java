package JavaIO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
	try {
		
		FileWriter fw = new FileWriter("output.txt");
		fw.write("Helooo...,");
		fw.close();
		System.out.println("Sucessfully File Written....!");
		
	}catch(IOException e) {
	
		System.out.println("Could not write .. "+e.getMessage());
	}
}
}
