package JavaIO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
	try {
		
		FileWriter fw = new FileWriter("File.txt");
		fw.write("Helooo...");
		System.out.println("Sucessfully File Written....!");
		
	}catch(IOException e) {
		
		System.out.println(e.getMessage());
	}
}
}
