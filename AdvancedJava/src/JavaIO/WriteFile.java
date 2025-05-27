package JavaIO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
	FileWriter fw = new FileWriter("output.txt");
	
	fw.write("Hello Java I/O...");
	fw.close();
	
	System.out.println("Sucessfully File Written...");
	}
}
